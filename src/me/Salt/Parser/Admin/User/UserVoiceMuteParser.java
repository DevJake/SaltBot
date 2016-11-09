package me.Salt.Parser.Admin.User;


import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


        for (String arg : cmd.getArgs()) {
            if (!(arg.startsWith(prefixes.get(0)) || arg.startsWith(prefixes.get(1)) || arg.startsWith(prefixes.get(2)) || arg.startsWith(prefixes.get(3)))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Please wrap text with spaces in quotation marks (\") or apostrophes (\')", null);
                return null;
            }
        }

        if (cmd.getArgs().length > prefixes.size()) {
            cmd.getEvent().getTextChannel().sendMessageAsync("The limit of arguments is " + prefixes.size(), null);
            return null;
        }

        for (String arg : cmd.getArgs()) {
            if (arg.equalsIgnoreCase(prefixes.get(0))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Parameter \"" + prefixes.get(0) + "\" specifies no data", null);
                return null;
            } else if (arg.equalsIgnoreCase(prefixes.get(1))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Parameter \"" + prefixes.get(1) + "\" specifies no data", null);
                return null;
            } else if (arg.equalsIgnoreCase(prefixes.get(2))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Parameter \"" + prefixes.get(2) + "\" specifies no data", null);
                return null;
            } else if (arg.equalsIgnoreCase(prefixes.get(3))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Parameter \"" + prefixes.get(3) + "\" specifies no data", null);
                return null;
            }


            if (arg.startsWith(prefixes.get(0))) {
                for (String a : arg.substring(prefixes.get(0).length(), arg.length()).split(";")) {
                    a = a.replace("\"", "");
                    a = a.replace("'", "");

                    if (a.equals("") || a.contains(" ")) {
                        cmd.getEvent().getTextChannel().sendMessageAsync("You cannot query quotation marks (\") or apostrophes (\')", null);
                        return null;
                    }

                    for (User user : Main.jda.getUsers()) {
                        if (user.getUsername().toLowerCase().contains(a.toLowerCase()) || user.getId().equals(a)) {
                            mutedUsers.add(mutedUsers.size(), user);
                        }
                    }

                    if (mutedUsers.size() <= 0) {
                        cmd.getEvent().getTextChannel().sendMessageAsync("No users could be found!", null);
                        return null;
                    }
                }

                StringBuilder sb = new StringBuilder();
                sb.append("```\n");
                for (User user : mutedUsers) {
                    sb.append(user.getUsername() + "\n");
                }
                sb.append("```");
                cmd.getEvent().getTextChannel().sendMessage(sb.toString());

            } else if (arg.startsWith(prefixes.get(1))) {

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
