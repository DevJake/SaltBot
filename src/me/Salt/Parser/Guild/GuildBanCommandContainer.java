package me.Salt.Parser.Guild;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;

public class GuildBanCommandContainer {
    private User banner;
    private User bannedUser;
    private Guild guild;
    private Date banTime;
    private String banReason;
    private Date banDuration;
    private MessageReceivedEvent event;
    private boolean isTempBan;

    public GuildBanCommandContainer(User banner, User bannedUser, Guild guild, Date banTime, String banReason, Date banDuration, MessageReceivedEvent event) {
        this.banner = banner;
        this.bannedUser = bannedUser;
        this.guild = guild;
        this.banTime = banTime;
        this.banReason = banReason;
        this.event = event;
        this.isTempBan = banDuration.getTime() > 0;
        this.banDuration = banDuration;
    }

    public User getBannedUser() {
        return bannedUser;
    }

    public boolean isTempBan() {
        return isTempBan;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }

    public User getBanner() {
        return banner;
    }

    public Guild getGuild() {
        return guild;
    }

    public Date getBanTime() {
        return banTime;
    }

    public String getBanReason() {
        return banReason;
    }

    public Date getBanDuration() {
        return banDuration;
    }
}
