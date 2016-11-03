package me.Salt.Commands.Channel;

import me.Salt.Util.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by zuezy on 21/09/2016.
 */
public class SetupCommand implements Command {
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
