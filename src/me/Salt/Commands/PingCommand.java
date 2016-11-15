package me.Salt.Commands;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class PingCommand implements Command {
    @Override
    public boolean called(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {
            cmd.getEvent().getTextChannel().sendMessageAsync("Pong!", null);

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
