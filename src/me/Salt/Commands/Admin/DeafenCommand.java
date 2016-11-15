package me.Salt.Commands.Admin;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.exceptions.PermissionException;

import java.util.Iterator;

/**
 * Created by zuezy on 06/08/2016.
 */
public class DeafenCommand implements Command {
    private final String HELP = "USAGE: " + Main.cmdPrefix + "deafen [Username] [Duration]";

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return false;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        MessageReceivedEvent event = cmd.getEvent();
        String[] args = cmd.getArgs();

        Iterator<User> users = event.getGuild().getVoiceStatusOfUser(event.getAuthor()).getChannel().getUsers().iterator();
        int count = 0;
        while (users.hasNext()) {
            if (users.next().getUsername().contains(args[0])) {
                count++;
            }
        }
        users = event.getGuild().getVoiceStatusOfUser(event.getAuthor()).getChannel().getUsers().iterator();

        while (users.hasNext()) {
            User userNext = users.next();

            if (userNext.getUsername().toLowerCase().contains(args[0].toLowerCase())) {
                if (count == 1) {
                    event.getTextChannel().sendMessage("You cannot deafen yourself!");
                    return;
                }
                try {
                    if (event.getGuild().getVoiceStatusOfUser(userNext).isServerDeaf()) {
                        event.getGuild().getManager().undeafen(userNext);
                        event.getGuild().getManager().update();
                        event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " has now undeafened: " + userNext.getUsername());
                        return;
                    } else {
                        event.getGuild().getManager().deafen(userNext);
                        event.getGuild().getManager().update();
                        event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " has now deafened: " + userNext.getUsername());
                        return;
                    }
                } catch (PermissionException exc) {
                    event.getTextChannel().sendMessage(
                            "Sorry " + event.getAuthor().getAsMention() +
                                    ", but we lack the permission to run this command!\nPermission: " +
                                    exc.getPermission());
                    return;
                }
            }
        }
        event.getTextChannel().sendMessage("The user, \"" + args[0] + "\", could not be found!\n" + help());
    }


    @Override
    public String help() {
        return HELP;
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public void setWaitResult(String input) {

    }
}
