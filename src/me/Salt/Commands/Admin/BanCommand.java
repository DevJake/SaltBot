package me.Salt.Commands.Admin;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by zuezy on 03/11/2016.
 */
public class BanCommand implements Command {


    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return false;
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
