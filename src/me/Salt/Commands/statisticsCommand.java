package me.Salt.Commands;

import me.Salt.Handlers.Main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.Date;

/**
 * Created by Salt001 on 14/11/2016.
 */
public class StatisticsCommand implements Command {
    @Override
    public boolean called(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {
        cmd.getEvent().getTextChannel().sendTyping();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            cmd.getEvent().getTextChannel().sendMessageAsync(ex.getMessage(), null);
        }

        cmd.getEvent().getTextChannel().sendMessageAsync("```" +
                "\nName: " + Main.jda.getSelfInfo().getUsername() + " (ID:" + Main.jda.getSelfInfo().getId() + ")" +
                "\nUptime (Seconds): " + (new Date().getTime() - Main.startTime.getTime())/1000 +
                "\nGuild count: " + Main.jda.getGuilds().size() +
                "\nTotal Message count: " + String.valueOf(Main.TotalMessageCount) +
                "\nUser Message count: " + String.valueOf(Main.TotalMessageCount - Main.BotMessageCount) +
                "\nBot Message count: " + String.valueOf(Main.BotMessageCount) + "\n```", null);
    }

    @Override
    public void executed(boolean success) {

    }

    @Override
    public void setWaitResult(String input) {

    }

    @Override
    public String help() {
        return null;
    }
}
