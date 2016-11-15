package me.Salt.Util;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by zuezy on 06/08/2016.
 */
public interface Command {
    boolean called(CommandParser.CommandContainer cmd, EventListener eventListener);

    void action(CommandParser.CommandContainer cmd);

    void executed(boolean success);

    void setWaitResult(String input); //Allows for users to confirm actions. Additional user input is sent back to the waiting object

    String help();
}
