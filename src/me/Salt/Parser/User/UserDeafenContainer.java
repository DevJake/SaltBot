package me.Salt.Parser.User;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class UserDeafenContainer {
    private User deafener;
    private User deafenedUser;
    private Guild guild;
    private Date deafenTime;
    private String deafenReason;
    private Date deafenDuration;
    private VoiceChannel[] deafenedVoiceChannels;

    public UserDeafenContainer(User deafener, User deafenedUser, Guild guild, Date deafenTime, String deafenReason, Date deafenDuration, VoiceChannel[] deafenedVoiceChannels, MessageReceivedEvent event) {
        this.deafener = deafener;
        this.deafenedUser = deafenedUser;
        this.guild = guild;
        this.deafenTime = deafenTime;
        this.deafenReason = deafenReason;
        this.deafenDuration = deafenDuration;
        this.deafenedVoiceChannels = deafenedVoiceChannels;
    }

    public User getDeafener() {
        return deafener;
    }

    public User getDeafenedUser() {
        return deafenedUser;
    }

    public Guild getGuild() {
        return guild;
    }

    public Date getDeafenTime() {
        return deafenTime;
    }

    public String getDeafenReason() {
        return deafenReason;
    }

    public Date getDeafenDuration() {
        return deafenDuration;
    }

    public VoiceChannel[] getDeafenedVoiceChannels() {
        return deafenedVoiceChannels;
    }
}
