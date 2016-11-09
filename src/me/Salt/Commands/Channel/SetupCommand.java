package me.Salt.Commands.Channel;

import me.Salt.Parser.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by zuezy on 21/09/2016.
 */
public class SetupCommand implements Command {
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
    public String help() {
        return null;
    }
}
