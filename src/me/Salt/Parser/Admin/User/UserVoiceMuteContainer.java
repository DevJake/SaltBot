package me.Salt.Parser.Admin.User;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;
import java.util.List;

public class UserVoiceMuteContainer {
    private User muter;
    private List<User> mutedUsers;
    private Guild guild;
    private Date muteTime;
    private List<String> muteReasons;
    private List<Integer> muteDuration;
    private MessageReceivedEvent event;
    private List<VoiceChannel> mutedVoiceChannel;
    private boolean isSuccessive;

    public UserVoiceMuteContainer(User muter, List<User> mutedUsers, Guild guild, Date muteTime, List<String> muteReasons, List<Integer> muteDuration, MessageReceivedEvent event, List<VoiceChannel> mutedVoiceChannel, boolean isSuccessive) {
        this.muter = muter;
        this.mutedUsers = mutedUsers;
        this.guild = guild;
        this.muteTime = muteTime;
        this.muteReasons = muteReasons;
        this.muteDuration = muteDuration;
        this.event = event;
        this.mutedVoiceChannel = mutedVoiceChannel;
        this.isSuccessive = isSuccessive;
    }

    public User getMuter() {
        return muter;
    }

    public List<User> getMutedUsers() {
        return mutedUsers;
    }

    public Guild getGuild() {
        return guild;
    }

    public Date getMuteTime() {
        return muteTime;
    }

    public List<String> getMuteReasons() {
        return muteReasons;
    }

    public List<Integer> getMuteDuration() {
        return muteDuration;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }

    public List<VoiceChannel> getMutedVoiceChannel() {
        return mutedVoiceChannel;
    }

    public boolean isSuccessive() {
        return isSuccessive;
    }


}
