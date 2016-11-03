package me.Salt.Commands;

import me.Salt.Util.Command;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.exceptions.PermissionException;

import java.util.Iterator;

/**
 * Created by zuezy on 06/08/2016.
 */
public class MuteCommand implements Command {
    private final String HELP = "USAGE: " + Main.cmdPrefix + "mute [Username] [Duration]";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String raw, String cmd, String beheaded, String splitBeheaded[], String[] args, String[] argsUpper, MessageReceivedEvent event) {

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
                    event.getTextChannel().sendMessage("You cannot mute yourself!");
                    return;
                }
                try {
                    if (event.getGuild().getVoiceStatusOfUser(userNext).isServerMuted()) {
                        event.getGuild().getManager().unmute(userNext);
                        event.getGuild().getManager().update();
                        event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " has now unmuted: " + userNext.getUsername());
                        return;
                    } else {
                        event.getGuild().getManager().mute(userNext);
                        event.getGuild().getManager().update();
                        event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " has now muted: " + userNext.getUsername());
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
    public void executed(boolean success, MessageReceivedEvent event) {

    }
}
