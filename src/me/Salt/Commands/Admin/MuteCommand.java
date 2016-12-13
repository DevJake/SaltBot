package me.Salt.Commands.Admin;

import me.Salt.Handlers.Main;
import me.Salt.Handlers.MuteHandler.MuteHandler;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Admin.User.UserVoiceMuteContainer;
import me.Salt.Parser.Admin.User.UserVoiceMuteParser;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.OnlineStatus;
import net.dv8tion.jda.Permission;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.utils.PermissionUtil;

import java.util.List;

/**
 * Created by zuezy on 06/08/2016.
 */
public class MuteCommand implements Command {

    public MuteHandler m;
    private UserVoiceMuteContainer c;
    private List<User> users;
    private EventListener eventListener;

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        c = new UserVoiceMuteParser().parse(cmd);
        this.eventListener = eventListener;
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        StringBuilder sb = new StringBuilder();

        if (c.getMutedUsers() != null) {
            users = c.getMutedUsers();
            for (int i = 0; i < users.size(); i++) {
                if (!(users.get(i).getOnlineStatus().equals(OnlineStatus.ONLINE))) {
                    users.remove(users.get(i));
                }
            }
        }

        if (PermissionUtil.checkPermission(Main.jda.getUserById(Main.jda.getSelfInfo().getId()), Permission.VOICE_MUTE_OTHERS, cmd.getEvent().getGuild()) && c != null) {
            //TODO: Consider changing from #PermissionUtil#checkPermission(), as checkPermission() is outdated
            for (int i = 0; i < users.size(); i++) {
                c.getGuild().getManager().mute(users.get(i));
                sb.append("Muted " + users.get(i));
                if (c.getMuteDuration().size() > i) {
                    if (c.getMuteDuration().get(i) > 1) {
                        sb.append(" for *" + c.getMuteDuration().get(i) + "* seconds, ");
                    } else {
                        sb.append(" *indefinitely* ");
                    }

                } else {
                    sb.append(" *indefinitely* ");
                }

                if (c.getMuteReasons().size() > i) {
                    sb.append("for reason: *\"" + c.getMuteReasons().get(i) + "\"*, in ");
                } else {
                    sb.append("*without reason*, in ");
                }

                if (c.getMutedVoiceChannel().size() > i) {
                    sb.append("VoiceChannel *" + c.getMutedVoiceChannel().get(0).getName() + "*");
                } else {
                    sb.append("*all VoiceChannels*");
                }

                sb.append("\n");
            }


            m = new MuteHandler(c, cmd, users);
            m.register(eventListener);
            //c.getEvent().getTextChannel().sendMessageAsync(sb.toString(), null);
        }

    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
