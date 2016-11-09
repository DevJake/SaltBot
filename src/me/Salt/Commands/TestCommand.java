package me.Salt.Commands;

import me.Salt.Parser.CommandParser;
import me.Salt.Util.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
    public String help() {
        return null;
    }
}
