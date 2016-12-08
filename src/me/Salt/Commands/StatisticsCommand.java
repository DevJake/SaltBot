package me.Salt.Commands;

import me.Salt.Handlers.main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.Date;

/**
 * Created by Salt001 on 14/11/2016.
 */
public class StatisticsCommand implements Command {
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true; //No preExecution checks
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {

        cmd.getEvent().getTextChannel().sendMessageAsync("```" +
                "\nName: " + main.jda.getSelfInfo().getUsername() + " (ID:" + main.jda.getSelfInfo().getId() + ")" +
                "\nUptime (Seconds): " + (new Date().getTime() - main.startTime.getTime())/1000 +
                "\nGuild count: " + main.jda.getGuilds().size() +
                "\nTotal Message count: " + String.valueOf(main.TotalMessageCount) +
                "\nUser Message count: " + String.valueOf(main.TotalMessageCount - main.BotMessageCount) +
                "\nBot Message count: " + String.valueOf(main.BotMessageCount) + "\n```", null);
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
