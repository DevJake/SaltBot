package me.Salt.Commands;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by zuezy on 07/08/2016.
 */
public class ChangeNameCommand implements Command {
    private final String HELP = "USAGE: " + Main.cmdPrefix + "ChangeName [New bot name]";

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        MessageReceivedEvent event = cmd.getEvent();
        String[] args = cmd.getArgs();
        if (args.length <= 0) {
            event.getTextChannel().sendMessage("You did not enter any arguments! " + event.getAuthor().getAsMention());
            return false;
        }

        if (args.length > 1) {
            event.getTextChannel().sendMessage("You entered more than one argument! " + event.getAuthor().getAsMention());
            return false;
        }
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        MessageReceivedEvent event = cmd.getEvent();
        String[] args = cmd.getArgs();
        String oldName = Main.jda.getUserById("203821834108534785").getUsername();
        Main.jda.getAccountManager().setNickname(event.getGuild(), args[0]);
        event.getTextChannel().sendMessage(event.getAuthor().getUsername() +
                " (ID: " + event.getAuthor().getId() + ") changed the name of the bot from \"" + oldName + "\" to \"" + args[0] + "\"");
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return HELP;
    }
}
