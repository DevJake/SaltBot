package me.Salt.Parser.Guild;

import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GuildBanCommandContainer {
    private User banner;
    private Guild guild;
    private Date banTime;
    private String banReason;
    private Date banDuration;
    private MessageReceivedEvent event;
    private boolean isTempBan;

    public GuildBanCommandContainer(User banner, User bannedUser, Guild guild, Date banTime, String banReason, Date banDuration, MessageReceivedEvent event) {
        this.banner = banner;
        this.guild = guild;
        this.banTime = banTime;
        this.banReason = banReason;
        this.event = event;
        this.isTempBan = banDuration.getTime() > 0;
        try {
            this.banDuration = new SimpleDateFormat("yyyyMMdd").parse(banDuration.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
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
