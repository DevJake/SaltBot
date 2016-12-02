package me.Salt.Commands.Admin;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import me.Salt.Handlers.main;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.exceptions.PermissionException;

import java.util.Iterator;

/**
A class for handling any Deafen commands. Implements the {@Link Command} interface  
 */
public class DeafenCommand implements Command {
    /**
    Defines the help information presented for the {@DeafenCommand}. 
    */
    private final String HELP = "USAGE: " + main.cmdPrefix + "deafen [Username] [Duration]";

    /**
    Manages the pre-execution of the Deafen command. 
    @param cmd The {@CommandContainer} for the entered command
    @param eventListener The event listener that this class was instantiated from
    @return Returns true
    @see CommandContainer
    @see EventListener
    */
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    /**
    Handles the core execution code of the Deafen command. 
    @param cmd The {@CommandContainer} for the entered command
    @see CommandContainer
    */
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

    /**
    Returns the help text
    @return {@HELP}
    */
    @Override
    public String help() {
        return HELP;
    }
    
    /**
    Handles the post-execution of the {@DeafenCommand}
    
    @param success If the pre-execution was successful
    */
    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public void setWaitResult(String input) {

    }
}
