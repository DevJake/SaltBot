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
    private int muteDuration;
    private MessageReceivedEvent event;
    private List<VoiceChannel> mutedVoiceChannel;

    public UserVoiceMuteContainer(User muter, List<User> mutedUsers, Guild guild, Date muteTime, List<String> muteReasons, int muteDuration, MessageReceivedEvent event, List<VoiceChannel> mutedVoiceChannel) {
        this.muter = muter;
        this.mutedUsers = mutedUsers;
        this.guild = guild;
        this.muteTime = muteTime;
        this.muteReasons = muteReasons;
        this.muteDuration = muteDuration;
        this.event = event;
        this.mutedVoiceChannel = mutedVoiceChannel;
    }

    public User getMuter() {
        return muter;
    }

    public void setMuter(User muter) {
        this.muter = muter;
    }

    public List<User> getMutedUsers() {
        return mutedUsers;
    }

    public void setMutedUsers(List<User> mutedUsers) {
        this.mutedUsers = mutedUsers;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Date getMuteTime() {
        return muteTime;
    }

    public void setMuteTime(Date muteTime) {
        this.muteTime = muteTime;
    }

    public List<String> getMuteReasons() {
        return muteReasons;
    }

    public void setMuteReasons(List<String> muteReasons) {
        this.muteReasons = muteReasons;
    }

    public int getMuteDuration() {
        return muteDuration;
    }

    public void setMuteDuration(int muteDuration) {
        this.muteDuration = muteDuration;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }

    public void setEvent(MessageReceivedEvent event) {
        this.event = event;
    }

    public List<VoiceChannel> getMutedVoiceChannel() {
        return mutedVoiceChannel;
    }

    public void setMutedVoiceChannel(List<VoiceChannel> mutedVoiceChannel) {
        this.mutedVoiceChannel = mutedVoiceChannel;
    }


}
