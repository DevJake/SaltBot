package me.Salt.Util;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by zuezy on 06/08/2016.
 */
public interface Command {
    boolean called(String[] args, MessageReceivedEvent event);

    void action(String raw, String cmd, String beheaded, String splitBeheaded[], String[] args, String[] argsUpper, MessageReceivedEvent event);

    void executed(boolean success, MessageReceivedEvent event);

    String help();

}
