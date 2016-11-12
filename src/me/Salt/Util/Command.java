package me.Salt.Util;

import me.Salt.Parser.Command.CommandParser;

/**
 * Created by zuezy on 06/08/2016.
 */
public interface Command {
    boolean called(CommandParser.CommandContainer cmd);

    void action(CommandParser.CommandContainer cmd);

    void executed(boolean success);

    String help();

}
