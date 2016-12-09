package me.Salt.Commands;

import me.Salt.Handlers.Main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.OnlineStatus;
import net.dv8tion.jda.entities.User;

import java.util.*;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class SearchCommand implements Command {
    private List<User> users = new ArrayList<>();
    private boolean currentGuild = false;
    private boolean onlineOnly = false;

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {


        for (String arg : cmd.getArgs()) {
            if (!(arg.startsWith("u:") || arg.equalsIgnoreCase("--g") || arg.equalsIgnoreCase("--o"))) {
                cmd.getEvent().getTextChannel().sendMessageAsync("Correct usage: `.search u:<Username/UserID> [--g] [--o]`", null);
                return;
            }

            if (arg.startsWith("u:") && !arg.equalsIgnoreCase("u:")) {
                arg = arg.replaceFirst("u:", "");
                String[] args = arg.split(";");
                List<User> allUsers = new ArrayList<>(Main.jda.getUsers());
                for (User u : allUsers) {
                    for (String user : args) {
                        if (u.getUsername().toLowerCase().contains(user.toLowerCase()) || u.getId().equals(u) && !users.contains(u)) {
                            users.add(u);
                        }
                    }
                }

            } else if (arg.equals("--g")) {
                this.currentGuild = true;
            } else if (arg.equals("--o")) {
                this.onlineOnly = true;
            } else {
                cmd.getEvent().getTextChannel().sendMessageAsync("Correct usage: `.search u:<Username/UserID> [--g] [--o]`", null);
                return;
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<User> s = new HashSet<User>(users);

        users = new ArrayList<>(s);

        if (users.size() > 0) {
            sb.append("Results: ");
            sb.append("```");
            for (User user : users) {
                if (onlineOnly && currentGuild) {
                    if (user.getOnlineStatus().equals(OnlineStatus.ONLINE)
                            && (cmd.getEvent().getGuild().getUsers().contains(user)
                            && cmd.getEvent().getGuild().getUsers().contains(cmd.getEvent().getAuthor()))) {
                        sb.append("\nUser: " + user.getUsername() + " (ID: " + user.getId() + ")");
                    }
                } else if (currentGuild) {
                    if (cmd.getEvent().getGuild().getUsers().contains(user) && cmd.getEvent().getGuild().getUsers().contains(cmd.getEvent().getAuthor())) {
                        sb.append("\nUser: " + user.getUsername() + " (ID: " + user.getId() + ")");
                    }
                } else if (onlineOnly) {
                    if (user.getOnlineStatus().equals(OnlineStatus.ONLINE)) {
                        sb.append("\nUser: " + user.getUsername() + " (ID: " + user.getId() + ")");
                    }
                } else {
                    sb.append("\nUser: " + user.getUsername() + " (ID: " + user.getId() + ")");
                }
            }
            sb.append("```");
            sb.append("Results for: `User online: " + onlineOnly + " User in current guild: " + currentGuild + "`");
        } else {
            sb.append("No results could be found");
        }

        cmd.getEvent().getTextChannel().sendMessageAsync(sb.toString(), null);

        currentGuild = false;
        onlineOnly = false;

    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public void setWaitResult(String input) {

    }

    @Override
    public String help() {
        return null;
    }
}
