package me.Salt.Commands;

import me.Salt.Handlers.Main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.Date;

/**
 * Created by Salt001 on 14/11/2016.
 */
public class statisticsCommand implements Command {
    @Override
    public boolean called(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {
        cmd.getEvent().getTextChannel().sendMessageAsync("```\nUptime (Seconds): " + (new Date().getTime() - Main.startTime.getTime())/1000, null);
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
