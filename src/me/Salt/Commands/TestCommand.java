package me.Salt.Commands;

import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by zuezy on 14/09/2016.
 */
public class TestCommand implements Command {

    @Override
    public boolean called(CommandParser.CommandContainer cmd) {
        return true;
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
