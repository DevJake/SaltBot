package me.Salt.Commands;

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
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String raw, String cmd, String beheaded, String[] splitBeheaded, String[] args, String[] argsUpper, MessageReceivedEvent event) {

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
