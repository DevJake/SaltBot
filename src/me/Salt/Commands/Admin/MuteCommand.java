package me.Salt.Commands.Admin;

import me.Salt.Parser.Admin.User.UserVoiceMuteContainer;
import me.Salt.Parser.Admin.User.UserVoiceMuteParser;
import me.Salt.Parser.CommandParser;
import me.Salt.Util.Command;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.OnlineStatus;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.exceptions.PermissionException;

import java.util.Iterator;

/**
 * Created by zuezy on 06/08/2016.
 */
public class MuteCommand implements Command {

    private UserVoiceMuteContainer c;

    @Override
    public boolean called(CommandParser.CommandContainer cmd) {
        c = new UserVoiceMuteParser().parse(cmd);
        return true;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {
        StringBuilder sb = new StringBuilder();

        String n = c.getMuteDuration() <= 0 ? "Duration: Indefinite" : "Duration: " + c.getMuteDuration();

        sb.append("```\n" + n);

        for (User user : c.getMutedUsers()) {
            if (user.getOnlineStatus().equals(OnlineStatus.ONLINE)) {
                sb.append("\nUser: " + user.getUsername());
            }
        }

        if (c.getMuteReasons()!=null) {
            for (String reason : c.getMuteReasons()) {
                    sb.append("\nReason: " + reason);
            }
        }

        if (c.getMutedVoiceChannel()!=null) {
            for (VoiceChannel vc : c.getMutedVoiceChannel()) {
                sb.append("\nVoiceChannel: " + vc.getName());
            }
        }

        sb.append("```");

        c.getEvent().getTextChannel().sendMessageAsync(sb.toString(), null);
    }

    @Override
    public void executed(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
