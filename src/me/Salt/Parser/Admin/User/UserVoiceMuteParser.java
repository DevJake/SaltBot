package me.Salt.Parser.Admin.User;


import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserVoiceMuteParser {
    private static int durationInSeconds;
    User mutedUser;
    String muteReason;
    Date muteDuration;
    VoiceChannel voiceChannel;
    MessageReceivedEvent event;
    private HashMap<String, Integer> timeMap = new HashMap<>();

    private void addTime(String timeScale, int duration) {
        if (timeScale.equalsIgnoreCase("s") && duration > 500000000) {
            event.getTextChannel().sendMessageAsync("The seconds cannot exceed 500 million", null);
        } else if (timeScale.equalsIgnoreCase("m") && duration > 8000000) {
            event.getTextChannel().sendMessageAsync("The minutes cannot exceed 8 million", null);
        } else if (timeScale.equalsIgnoreCase("h") && duration > 138000) {
            event.getTextChannel().sendMessageAsync("The hours cannot exceed 138,000", null);
        } else if (timeScale.equalsIgnoreCase("d") && duration > 5000) {
            event.getTextChannel().sendMessageAsync("The days cannot exceed 5000", null);
        } else if (timeScale.equalsIgnoreCase("w") && duration > 800) {
            event.getTextChannel().sendMessageAsync("The weeks cannot exceed 800", null);
        } else {
            if (timeScale.equalsIgnoreCase("s")) {
                durationInSeconds = durationInSeconds + duration * timeMap.get(timeScale);
            } else if (timeScale.equalsIgnoreCase("m")) {
                durationInSeconds = durationInSeconds + duration * timeMap.get(timeScale);
            } else if (timeScale.equalsIgnoreCase("h")) {
                durationInSeconds = durationInSeconds + duration * timeMap.get(timeScale);
            } else if (timeScale.equalsIgnoreCase("d")) {
                durationInSeconds = durationInSeconds + duration * timeMap.get(timeScale);
            } else if (timeScale.equalsIgnoreCase("w")) {
                durationInSeconds = durationInSeconds + duration * timeMap.get(timeScale);
            }

            event.getTextChannel().sendMessageAsync("durationInSeconds: " + durationInSeconds, null);
        }
    }

    public UserVoiceMuteContainer parse(CommandParser.CommandContainer cmd) {
        this.event = cmd.getEvent();
        timeMap.put("s", 1);
        timeMap.put("m", 60);
        timeMap.put("h", 3600);
        timeMap.put("d", 86400);
        timeMap.put("w", 604800);

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

        if (cmd.getArgs().length <= 0) {
            cmd.getEvent().getTextChannel().sendMessageAsync("**You must specify the parameter, \"" + prefixes.get(0) + "\"**", null);
            return null;
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


            } else if (arg.startsWith(prefixes.get(1))){

            } else if (arg.startsWith(prefixes.get(2))) {
                arg = arg.substring(prefixes.get(1).length(), arg.length());
                arg = arg.replace("\"", "");
                arg = arg.replace("'", "");

                event.getTextChannel().sendMessage(arg);

                if (arg.equals("") || arg.contains(" ")) {
                    cmd.getEvent().getTextChannel().sendMessageAsync("You cannot query quotation marks (\") or apostrophes (\')", null);
                    return null;
                }

                if (arg.length() > 1) {
                    while (arg.contains("s") || arg.contains("m") || arg.contains("h") || arg.contains("d") || arg.contains("w") && arg.length()>1) {
                        try {
                            if (arg.indexOf("s") <= 1) {
                                event.getTextChannel().sendMessageAsync(String.valueOf(arg.charAt(arg.indexOf("s") - 1)), null);
                                addTime("s", Integer.valueOf(String.valueOf(arg.substring(0, arg.indexOf("s") - 1))));
                                arg = arg.substring(arg.indexOf("s") + 1, arg.length());
                            } else if (arg.indexOf("m") <= 1) {
                                event.getTextChannel().sendMessageAsync(String.valueOf(arg.charAt(arg.indexOf("m") - 1)), null);
                                addTime("m", Integer.valueOf(String.valueOf(arg.substring(0, arg.indexOf("m") - 1))));
                                arg = arg.substring(arg.indexOf("m") + 1, arg.length());
                            } else if (arg.indexOf("h") <= 1) {
                                event.getTextChannel().sendMessageAsync(String.valueOf(arg.charAt(arg.indexOf("h") - 1)), null);
                                addTime("h", Integer.valueOf(String.valueOf(arg.substring(0, arg.indexOf("h") - 1))));
                                arg = arg.substring(arg.indexOf("h") + 1, arg.length());
                            } else if (arg.indexOf("d") <= 1) {
                                event.getTextChannel().sendMessageAsync(String.valueOf(arg.charAt(arg.indexOf("d") - 1)), null);
                                addTime("d", Integer.valueOf(String.valueOf(arg.substring(0, arg.indexOf("d") - 1))));
                                arg = arg.substring(arg.indexOf("d") + 1, arg.length());
                            } else if (arg.indexOf("w") <= 1) {
                                event.getTextChannel().sendMessageAsync(String.valueOf(arg.charAt(arg.indexOf("w") - 1)), null);
                                addTime("w", Integer.valueOf(String.valueOf(arg.substring(0, arg.indexOf("w") - 1))));
                                arg = arg.substring(arg.indexOf("w") + 1, arg.length());
                            }
                        } catch (ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException ex) {
                            continue;
                        }
                    }
                } else {
                    cmd.getEvent().getTextChannel().sendMessageAsync("You can use `w, d, h, m, s`\nExample duration: 10m30s", null);
                }
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
