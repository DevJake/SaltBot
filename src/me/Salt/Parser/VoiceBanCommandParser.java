package me.Salt.Parser;


import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.Date;
import java.util.List;

public class BanCommandParser {
    private User bannedUser = null;

    private final String ERROR_NO_USER_SPECIFIED = "No user was specified";
    private final String ERROR_USER_NOT_FOUND = "The user could not be found";

    public BanCommandContainer parse(CommandParser.CommandContainer cmd) {

        List<User> users = cmd.getEvent().getGuild().getUsersByName(cmd.getArgs()[0]);
        if (users.size() <= 1) {
            cmd.getEvent().getTextChannel().sendMessage(ERROR_NO_USER_SPECIFIED);
            return null; // Incorrect arguments, retry command
        }

        for (User user : users) {
            if (user == null) {
                cmd.getEvent().getTextChannel().sendMessage(ERROR_USER_NOT_FOUND);
                break;
                return null;
            }

            if (user.getUsername().contains(cmd.getArgs()[0])){
                bannedUser = user;
            }

        }

        if (bannedUser==null){
            cmd.getEvent().getTextChannel().sendMessage(ERROR_NO_USER_SPECIFIED);
            return null;
        }

        for (String arg : cmd.getArgs()) {
            if (arg.startsWith("d:")) {

            } else if (arg.startsWith("r:")) {

            }
        }
        return new BanCommandContainer(cmd.getEvent().getAuthor(), bannedUser, cmd.getEvent().getGuild(), new Date(), , cmd.getEvent());
    }

    public class BanCommandContainer {
        private User banner;
        private Guild guild;
        private Date banTime;
        private String banReason;
        private int banDuration;
        private MessageReceivedEvent event;
        private boolean isTempBan;

        public BanCommandContainer(User banner, User bannedUser, Guild guild, Date banTime, String banReason, int banDuration, MessageReceivedEvent event) {
            this.banner = banner;
            this.guild = guild;
            this.banTime = banTime;
            this.banReason = banReason;
            this.banDuration = banDuration;
            this.event = event;
            this.isTempBan = banDuration > 0;
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
