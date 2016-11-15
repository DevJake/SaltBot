package me.Salt.Commands.Admin;

import me.Salt.Container.CommandDescription;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.HashMap;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class DescribeCommand implements Command {
    private static HashMap<String, CommandDescription> cmdDescs = new HashMap<>();
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {

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
