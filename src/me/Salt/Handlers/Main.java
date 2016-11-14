package me.Salt.Handlers;

import me.Salt.Commands.Admin.DeafenCommand;
import me.Salt.Commands.Admin.MuteCommand;
import me.Salt.Commands.ChangeNameCommand;
import me.Salt.Commands.Channel.ChannelCommandHandler;
import me.Salt.Commands.TestCommand;
import me.Salt.Commands.statisticsCommand;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

import javax.security.auth.login.LoginException;
import java.awt.*;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static HashMap<String, Command> commands = new HashMap<>();
    public static String cmdPrefix = ".";
    public static JDA jda;
    public static EventListener eventListener = new EventListener();
    public static final Date startTime = new Date();

    public static void main(String[] args) {
        try {
            jda = new JDABuilder().setBotToken("MjQ2MzA5NDI1OTAyNjQ5MzQ1.CwZHLw.SDE5mlbpbOm0kjvbjNE3hO7gReI").buildBlocking();
            jda.addEventListener(eventListener);
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
        commands.put("stats", new statisticsCommand());
    }

    public static void handleCommand(CommandParser.CommandContainer cmd) {
        if (commands.containsKey(cmd.getCmd())) {
            boolean safe = commands.get(cmd.getCmd()).called(cmd, eventListener);

            if (safe) {
                commands.get(cmd.getCmd()).action(cmd);
                commands.get(cmd.getCmd()).executed(safe);
            } else {
                commands.get(cmd.getCmd()).executed(safe);
            }
        }
    }
}