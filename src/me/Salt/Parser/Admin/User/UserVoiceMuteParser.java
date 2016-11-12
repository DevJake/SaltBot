package me.Salt.Parser.Admin.User;


import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.entities.VoiceChannel;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserVoiceMuteParser {
    private MessageReceivedEvent event;
    private List<VoiceChannel> voiceChannels = new ArrayList<>();
    private List<User> mutedUsers = new ArrayList<>();
    private List<String> reasons = new ArrayList<>();
    private List<Integer> muteDurations = new ArrayList<>();
    private int durationInSeconds = 0;
    private boolean isSucc = false;

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
                durationInSeconds += duration;
            } else if (timeScale.equalsIgnoreCase("m")) {
                durationInSeconds += duration * 60;
            } else if (timeScale.equalsIgnoreCase("h")) {
                durationInSeconds += duration * 3600;
            } else if (timeScale.equalsIgnoreCase("d")) {
                durationInSeconds += duration * 86400;
            } else if (timeScale.equalsIgnoreCase("w")) {
                durationInSeconds += duration * 604800;
            }
        }
    }

    public UserVoiceMuteContainer parse(CommandParser.CommandContainer cmd) {
        this.event = cmd.getEvent();

        final List<String> prefixes = new ArrayList<>();

        prefixes.add("u:");
        prefixes.add("r:");
        prefixes.add("d:");
        prefixes.add("vc:");

        for (String arg : cmd.getArgs()) {
            if (!(arg.contains("succ") || arg.startsWith(prefixes.get(0)) || arg.startsWith(prefixes.get(1)) || arg.startsWith(prefixes.get(2)) || arg.startsWith(prefixes.get(3)))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Please wrap text with spaces in quotation marks (\") or apostrophes (\')", null);
                return null;
            }
        }

        if (cmd.getArgs().length <= 0) {
            cmd.getEvent().getTextChannel().sendMessageAsync("**You must specify the parameter, \"" + prefixes.get(0) + "\"**", null);
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

                    for (User user : event.getGuild().getUsers()) {
                        if (user.getUsername().toLowerCase().contains(a.toLowerCase()) || user.getId().equals(a)) {
                            this.mutedUsers.add(user);
                        }
                    }

                    if (this.mutedUsers.size() <= 0) {
                        cmd.getEvent().getTextChannel().sendMessageAsync("No users could be found!", null);
                        return null;
                    }
                }

            } else if (arg.startsWith(prefixes.get(1)) && !(arg.equalsIgnoreCase(prefixes.get(1)))) {
                arg = arg.replaceFirst(prefixes.get(1), "");
                String[] reasons = arg.split(";");
                Collections.addAll(this.reasons, reasons);

            } else if (arg.startsWith(prefixes.get(2)) && !(arg.equalsIgnoreCase(prefixes.get(2)))) {

                arg = arg.substring(prefixes.get(2).length(), arg.length());


                if (!(Pattern.compile("\\d?\\d?\\d?\\d[smhdw]").matcher(arg)).find()) {
                    cmd.getEvent().getTextChannel().sendMessageAsync("You can use `w, d, h, m, s`\nExample duration: 10m30s", null);
                    return null;
                }

                String[] durations = arg.split(";");

                for (String duration : durations) {
                    Matcher pat = Pattern.compile("\\d?\\d?\\d?\\d[smhdw]").matcher(duration);
                    List<String> times = new ArrayList<>();

                    while (pat.find()) {
                        times.add(pat.group());
                        duration = arg.replaceFirst("\\d?\\d?\\d?\\d[smhdw]", "");
                    }

                    for (String item : times) {
                        addTime(item.substring(item.length() - 1), Integer.parseInt(item.substring(0, item.length() - 1)));
                    }

                    this.muteDurations.add(durationInSeconds);
                    durationInSeconds = 0;

                }
            } else if (arg.startsWith(prefixes.get(3)) && !(arg.equalsIgnoreCase(prefixes.get(3)))) {

                arg = arg.replaceFirst(prefixes.get(3), "");
                String[] vcs = arg.split(";");
                for (VoiceChannel vc : event.getGuild().getVoiceChannels()) {
                    for (String a : vcs) {
                        if (vc.getName().toLowerCase().contains(a.toLowerCase()) || vc.getId().equalsIgnoreCase(a)) {
                            voiceChannels.add(vc);
                        }
                    }
                }
            } else if (arg.equals("--succ")) {
                this.isSucc = true;
            }
        }
        return new UserVoiceMuteContainer(cmd.getEvent().getAuthor(), this.mutedUsers, cmd.getEvent().getGuild(), new Date(), this.reasons, this.muteDurations, cmd.getEvent(), this.voiceChannels, isSucc);
    }

}
