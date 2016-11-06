package me.Salt.Handlers;

import me.Salt.Commands.Admin.DeafenCommand;
import me.Salt.Commands.Admin.MuteCommand;
import me.Salt.Commands.ChangeNameCommand;
import me.Salt.Commands.Channel.ChannelCommandHandler;
import me.Salt.Commands.TestCommand;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.HashMap;

public class Main {
    public static HashMap<String, Command> commands = new HashMap<String, Command>();
    public static String cmdPrefix = ".";
    public static JDA jda;

    public static void main(String[] args) {
        try {
            jda = new JDABuilder().setBotToken("MjAzODIxODM0MTA4NTM0Nzg1.Cmuf6w.sFr92ghjfrWFpG-3bVp_aA05ph0").buildBlocking();
            jda.addEventListener(new EventListener());
            jda.setAutoReconnect(true);
        } catch (LoginException e) {
            System.out.println("Login Exception");
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }

        commands.put("mute", new MuteCommand());
        commands.put("deafen", new DeafenCommand());
        commands.put("changename", new ChangeNameCommand());
        commands.put("test", new TestCommand());
        commands.put("channel", new ChannelCommandHandler());
    }

    public static void handleCommand(CommandParser.CommandContainer cmd) {
        if (commands.containsKey(cmd.getCmd())) {
            boolean safe = commands.get(cmd.getCmd()).called(cmd);

            if (safe) {
                commands.get(cmd.getCmd()).action(cmd);
                commands.get(cmd.getCmd()).executed(safe);
            } else {
                commands.get(cmd.getCmd()).executed(safe);
            }
        }
    }
}