package me.Salt.Commands.Admin;

import me.Salt.Handlers.Main;
import me.Salt.Parser.Admin.User.UserVoiceMuteContainer;
import me.Salt.Parser.Admin.User.UserVoiceMuteParser;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.Permission;
import net.dv8tion.jda.utils.PermissionUtil;

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

        if (PermissionUtil.checkPermission(Main.jda.getUserById(Main.jda.getSelfInfo().getId()), Permission.VOICE_MUTE_OTHERS, cmd.getEvent().getGuild()) && c!=null) {
            for (int i = 0; i < c.getMutedUsers().size(); i++) {
                sb.append("`");
                sb.append(c.getMutedUsers().get(i));
                if (c.getMuteDuration().size() > i) {
                    if (c.getMuteDuration().get(i) > 1) {
                        sb.append("\nDuration: " + c.getMuteDuration().get(i));
                    } else {
                        sb.append("\nDuration: Indefinite");
                    }

                } else {
                    sb.append("\nDuration: Indefinite");
                }

                if (c.getMuteReasons().size() > i) {
                    sb.append(c.getMuteReasons().get(i));
                } else {
                    sb.append("--No Reason--");
                }

                if (c.getMutedVoiceChannel().size() > i) {
                    sb.append(c.getMutedVoiceChannel().get(0).getName());
                } else {
                    sb.append("--No VoiceChannel--");
                }

                sb.append("`");

                c.getEvent().getTextChannel().sendMessageAsync(sb.toString(), null);

                sb.delete(0, sb.length());
            }
        }

    }

    @Override
    public void executed(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
