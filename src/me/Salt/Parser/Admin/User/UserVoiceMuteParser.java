package me.Salt.Parser.Admin.User;


import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserVoiceMuteParser {

    public UserVoiceMuteContainer parse(CommandParser.CommandContainer cmd) {
        String muteReason = null;
        Date muteDuration = null;
        User[] mutedUsers = {};

        final String userPrefix = "u:";
        final String reasonPrefix = "r:";
        final String durationPrefix = "t:";
        final String VoiceChannelPrefix = "c:";

        VoiceChannel mutedVoiceChannel = null;

        if (!(cmd.getRaw().contains(userPrefix))) {
            cmd.getEvent().getTextChannel().sendMessage("You didn't specify a user! Use ***" + Main.cmdPrefix + cmd.getCmd() + " help*** to receive help");
            return null;
        }

        for (String arg : cmd.getArgs()) {
            if (arg.startsWith(userPrefix)) {
                if (arg.substring(userPrefix.length(), userPrefix.length() + 1).equals(" ")) {
                    return null;
                } else {
                    cmd.getEvent().getGuild().getUsers().stream().filter(user -> user.getUsername().contains(arg.substring(userPrefix.length(), arg.length()))).forEach(user -> {
                        System.out.println(user.getUsername());
                        mutedUsers[mutedUsers.length] = user;
                    });
                }
            } else if (arg.startsWith(reasonPrefix)) {
                if (arg.substring(reasonPrefix.length(), reasonPrefix.length() + 1).equals(" ")) {
                    return null;
                } else {
                    System.out.println(arg);
                    muteReason = arg;
                }
            } else if (arg.startsWith(durationPrefix)) {
                if (arg.substring(durationPrefix.length(), durationPrefix.length() + 1).equals(" ")) {
                    return null;
                } else {
                    try {
                        muteDuration = new SimpleDateFormat("yyyyMMdd").parse(arg);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                }
            } else if (arg.startsWith(VoiceChannelPrefix)) {
                if (arg.substring(durationPrefix.length(), durationPrefix.length() + 1).equals(" ")) {
                    return null;
                } else {
                    if (Main.jda.getVoiceChannelByName(arg.substring(VoiceChannelPrefix.length(), arg.length())).size() < 1) {
                        cmd.getEvent().getTextChannel().sendMessage("The VoiceChannel(s) specified could not be found!");
                        return null;
                    } else {
                        mutedVoiceChannel = Main.jda.getVoiceChannelByName(arg.substring(VoiceChannelPrefix.length(), arg.length())).get(0);
                    }
                }
            }

        }

        return new UserVoiceMuteContainer(cmd.getEvent().getAuthor(), mutedUsers, cmd.getEvent().getGuild(), new Date(), muteReason, muteDuration, mutedVoiceChannel, cmd.getEvent());
    }

}
