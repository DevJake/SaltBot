package me.Salt.Parser.Admin.User;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;

public class UserVoiceMuteContainer {
    private User muter;
    private User mutedUser;
    private Guild guild;
    private Date muteTime;
    private String muteReason;
    private Date muteDuration;
    private MessageReceivedEvent event;
    private boolean isTempMute;
    private VoiceChannel[] mutedVoiceChannels;

    public UserVoiceMuteContainer(User muter, User mutedUser, Guild guild, Date muteTime, String muteReason, Date muteDuration, VoiceChannel[] mutedVoiceChannels, MessageReceivedEvent event) {
        this.muter = muter;
        this.mutedUser = mutedUser;
        this.guild = guild;
        this.muteTime = muteTime;
        this.muteReason = muteReason;
        this.muteDuration = muteDuration;
        this.event = event;
        this.isTempMute = muteDuration.getTime() > 0;
        this.mutedVoiceChannels = mutedVoiceChannels;
    }

    public VoiceChannel[] getMutedVoiceChannels() {
        return mutedVoiceChannels;
    }

    public User getMutedUser() {
        return mutedUser;
    }

    public boolean isTempMute() {
        return isTempMute;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }

    public User getMuter() {
        return muter;
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
}
