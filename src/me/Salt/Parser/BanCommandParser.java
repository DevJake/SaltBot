package me.Salt.Parser;


import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;

/**
 * Created by zuezy on 03/11/2016.
 */
public class BanCommandParser {

    public BanCommandContainer parse(CommandParser.CommandContainer cmd) {
        return new BanCommandContainer();
    }

    public class BanCommandContainer {
        private User banner;
        private Guild guild;
        private Date banTime;
        private String banReason;
        private Date banDuration;
        private MessageReceivedEvent event;
        private boolean isTempBan;

        public BanCommandContainer(User banner, Guild guild, Date banTime, String banReason, Date banDuration, MessageReceivedEvent event) {
            this.banner = banner;
            this.guild = guild;
            this.banTime = banTime;
            this.banReason = banReason;
            this.banDuration = banDuration;
            this.event = event;
            this.isTempBan = banDuration.getTime() > 0;
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
}
