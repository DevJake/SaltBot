package me.Salt.Handlers.MuteHandler;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Admin.User.UserVoiceMuteContainer;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.CommandHandler;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.Event;
import net.dv8tion.jda.events.voice.VoiceJoinEvent;

import java.util.List;

/**
 * Created by Salt001 on 14/11/2016.
 * Handles the long-term muting of users.
 */
public class MuteHandler implements CommandHandler {
    private UserVoiceMuteContainer c;
    private CommandParser.CommandContainer cmd;
    private List<User> users;
    private EventListener eventListener;

    public MuteHandler(UserVoiceMuteContainer c, CommandParser.CommandContainer cmd, List<User> users) {
        this.c = c;
        this.cmd = cmd;
        this.users = users;
    }

    @Override
    public void register(EventListener eventListener) {
    }

    @Override
    public void receive(Event event) {
        if (event instanceof VoiceJoinEvent) {
            for (User u : users) {
                if (((VoiceJoinEvent) event).getUser().getId().equals(u.getId())) {
                    if (!(c.getGuild().getVoiceStatusOfUser(u).isServerMuted())) {
                        c.getGuild().getManager().mute(u);
                    }
                }
            }
        }
    }

    @Override
    public void unregister(EventListener eventListener) {

    }
}
