package me.Salt.Parser.Admin.User;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.TextChannel;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;

/**
 * Created by Salt001 on 05/11/2016.
 */

public class UserTextChannelMuteContainer {
    private TextChannel[] mutedChannels;
    private User muter;
    private User mutedUser;
    private Guild guild;
    private Date muteTime;
    private String muteReason;
    private Date muteDuration;
    private MessageReceivedEvent event;

    public UserTextChannelMuteContainer(User muter, User mutedUser, Guild guild, Date muteTime, String muteReason, Date muteDuration, TextChannel[] mutedChannels, MessageReceivedEvent event) {

    }

    public TextChannel[] getMutedChannels() {
        return mutedChannels;
    }

    public User getMuter() {
        return muter;
    }

    public User getMutedUser() {
        return mutedUser;
    }

    public Guild getGuild() {
        return guild;
    }

    public Date getMuteTime() {
        return muteTime;
    }

    public String getMuteReason() {
        return muteReason;
    }

    public Date getMuteDuration() {
        return muteDuration;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }
}
