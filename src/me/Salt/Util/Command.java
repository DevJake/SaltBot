package me.Salt.Util;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by zuezy on 06/08/2016.
 */
public interface Command {
    boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener);

    void execution(CommandParser.CommandContainer cmd);

    void postExecution(boolean success);

    String help();
}
