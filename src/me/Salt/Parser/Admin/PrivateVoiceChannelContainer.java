package me.Salt.Parser.Admin;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;

import java.util.Date;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class PrivateVoiceChannelContainer {
    public PrivateVoiceChannelContainer(User user, Guild guild, VoiceChannel[] activeChannels, boolean isActive, Date time, Date duration, String reason, User[] whitelist) {
        this.user = user;
        this.guild = guild;
        this.activeChannels = activeChannels;
        this.isActive = isActive;
        this.time = time;
        this.duration = duration;
        this.reason = reason;
        Whitelist = whitelist;
    }

    public User getUser() {
        return user;
    }

    public Guild getGuild() {
        return guild;
    }

    public VoiceChannel[] getActiveChannels() {
        return activeChannels;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getTime() {
        return time;
    }

    public Date getDuration() {
        return duration;
    }

    public String getReason() {
        return reason;
    }

    public User[] getWhitelist() {
        return Whitelist;
    }

    private User user;
    private Guild guild;
    private VoiceChannel[] activeChannels;
    private boolean isActive;
    private Date time;
    private Date duration;
    private String reason;
    private User[] Whitelist;

}
