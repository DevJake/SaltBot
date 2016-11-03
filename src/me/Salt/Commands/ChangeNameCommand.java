package me.Salt.Commands;

import me.Salt.Util.Command;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by zuezy on 07/08/2016.
 */
public class ChangeNameCommand implements Command {
    private final String HELP = "USAGE: " + Main.cmdPrefix + "ChangeName [New bot name]";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
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
    public void action(String raw, String cmd, String beheaded, String[] splitBeheaded, String[] args, String[] argsUpper, MessageReceivedEvent event) {
        String oldName = Main.jda.getUserById("203821834108534785").getUsername();
        Main.jda.getAccountManager().setNickname(event.getGuild(), args[0]);
        event.getTextChannel().sendMessage(event.getAuthor().getUsername() +
                " (ID: " + event.getAuthor().getId() + ") changed the name of the bot from \"" + oldName + "\" to \"" + args[0] + "\"");
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return HELP;
    }
}
