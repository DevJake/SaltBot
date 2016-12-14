package me.Salt.Commands;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by Salt001 on 15/11/2016.
 * Manages the pinging (and following response) of the bot.
 */
public class PingCommand implements Command {
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        cmd.getEvent().getTextChannel().sendMessageAsync("Pong!", null);

    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
