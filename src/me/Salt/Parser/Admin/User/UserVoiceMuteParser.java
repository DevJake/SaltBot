package me.Salt.Parser.Admin.User;


import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserVoiceMuteParser {
    User mutedUser;
    String muteReason;
    Date muteDuration;
    VoiceChannel voiceChannel;

    public UserVoiceMuteContainer parse(CommandParser.CommandContainer cmd) {


        final String userPrefix = "u:";
        final String reasonPrefix = "r:";
        final String durationPrefix = "t:";
        final String VoiceChannelPrefix = "vc:";


        if (!(cmd.getRaw().contains(userPrefix))) {
            cmd.getEvent().getTextChannel().sendMessage("You didn't specify a user! Use ***" + Main.cmdPrefix + cmd.getCmd() + " help*** to receive help");
            return null;
        }

        for (String arg : cmd.getArgs()) {
            if (arg.startsWith(userPrefix) && arg.length()>userPrefix.length()) {
                try {
                    mutedUser = Main.jda.getUsersByName(arg.substring(userPrefix.length(), arg.length())).get(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (arg.startsWith(reasonPrefix) && arg.length()>reasonPrefix.length()){
                muteReason = arg.substring(reasonPrefix.length(), arg.length());
            } else if (arg.startsWith(durationPrefix) && arg.length()>durationPrefix.length()){
                try {
                    muteDuration = new SimpleDateFormat("yyyyMMdd").parse(arg.substring(durationPrefix.length(), arg.length()));
                } catch (ParseException ex){
                    ex.printStackTrace();
                }
            } else if (arg.startsWith(VoiceChannelPrefix) && arg.length()>VoiceChannelPrefix.length()){
                try {
                    voiceChannel = Main.jda.getVoiceChannelByName(arg.substring(VoiceChannelPrefix.length(), VoiceChannelPrefix.length())).get(0);
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }

        if (mutedUser==null || muteDuration==null || muteReason==null || voiceChannel==null){
            return null;
        }

        return new UserVoiceMuteContainer(cmd.getEvent().getAuthor(), mutedUser, cmd.getEvent().getGuild(), new Date(), muteReason, muteDuration, voiceChannel, cmd.getEvent());
    }

}
