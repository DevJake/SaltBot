package me.Salt.Commands;

import me.Salt.Handlers.Main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.Date;

/**
 * Created by Salt001 on 14/11/2016.
 * Manages the retrieval of bot-statistics.
 */
public class StatisticsCommand implements Command {
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true; //No preExecution checks
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {

        cmd.getEvent().getTextChannel().sendMessageAsync("```" +
                "\nName: " + Main.jda.getSelfInfo().getUsername() + " (ID:" + Main.jda.getSelfInfo().getId() + ")" +
                "\nUptime (Seconds): " + (new Date().getTime() - Main.startTime.getTime()) / 1000 +
                "\nGuild count: " + Main.jda.getGuilds().size() +
                "\nTotal Message count: " + String.valueOf(Main.TotalMessageCount) +
                "\nUser Message count: " + String.valueOf(Main.TotalMessageCount - Main.BotMessageCount) +
                "\nBot Message count: " + String.valueOf(Main.BotMessageCount) + "\n```", null);
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
