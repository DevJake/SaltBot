package me.Salt.Commands.Channel;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by zuezy on 21/09/2016.
 */
public class SetupCommand implements Command {

    @Override
    public boolean called(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return false;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {

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
