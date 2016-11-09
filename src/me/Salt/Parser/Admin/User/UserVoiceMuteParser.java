package me.Salt.Parser.Admin.User;


import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserVoiceMuteParser {
    User mutedUser;
    String muteReason;
    Date muteDuration;
    VoiceChannel voiceChannel;

    public UserVoiceMuteContainer parse(CommandParser.CommandContainer cmd) {

        final List<String> prefixes = new ArrayList<>();

        prefixes.add("u:");
        prefixes.add("r:");
        prefixes.add("d:");
        prefixes.add("vc:");

        List<User> mutedUsers = new ArrayList<>();


        for (String arg : cmd.getArgs()){
            if (arg.startsWith(prefixes.get(0))){
                for (String a : arg.substring(prefixes.get(0).length(), arg.length()).split(";")) {
                    for (User user : Main.jda.getUsers()){
                        if (user.getUsername().contains(a) || user.getId().equals(a)){
                            mutedUsers.add(mutedUsers.size(), user);
                        }
                    }
                }

                StringBuilder sb = new StringBuilder();
                sb.append("```\n");
                for (User user : mutedUsers){
                    sb.append(user.getUsername() + "\n");
                }
                sb.append("```");
                cmd.getEvent().getTextChannel().sendMessage(sb.toString());

            } else if (arg.startsWith(prefixes.get(1))){

            }
        }





//        if (!(cmd.getRaw().contains(userPrefix))) {
//            cmd.getEvent().getTextChannel().sendMessage("You didn't specify a user! Use ***" + Main.cmdPrefix + cmd.getCmd() + " help*** to receive help");
//            return null;
//        }
//
//        for (String arg : cmd.getArgs()) {
//            if (arg.startsWith(userPrefix) && arg.length()>userPrefix.length()) {
//                try {
//                    mutedUser = Main.jda.getUsersByName(arg.substring(userPrefix.length(), arg.length())).get(0);
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//
//        }

//        if (mutedUser==null || muteDuration==null || muteReason==null || voiceChannel==null){
//            return null;
//        }

//        System.out.println(cmd.getEvent().getAuthor() + "\n" + mutedUser + "\n" +
//                cmd.getEvent().getGuild() + "\n" + new Date() + "\n" + muteReason +
//                "\n" + muteDuration + "\n" + voiceChannel + "\n" + cmd.getEvent());

        return new UserVoiceMuteContainer(null, null, null, null, null, null, null, null);
    }

}
