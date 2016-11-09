package me.Salt.Listeners;

import me.Salt.Handlers.Logging.FileLogger;
import me.Salt.Handlers.Logging.LoggerEventDistributor;
import me.Salt.Handlers.Main;
import me.Salt.Parser.CommandParser;
import net.dv8tion.jda.events.Event;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

/**
 * Created by zuezy on 06/08/2016.
 */
public class EventListener extends ListenerAdapter {

    //private static FileLogger fl = new FileLogger();

    private boolean isCmdSafe(String content, Boolean isBot) {
        return (content.startsWith(Main.cmdPrefix) && !isBot);
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (isCmdSafe(event.getMessage().getContent(), event.getMessage().getAuthor().isBot())) {
            Main.handleCommand(new CommandParser().parse(
                    event.getMessage().getContent(), event, Main.cmdPrefix));
        }
    }

//    public void onEvent(Event event) {
//        //TODO LoggerEventDistributor led = new LoggerEventDistributor(event);
//    }
//    Uncommenting results in events not being registered. Sort out LoggerEventDistributor, then remove onEvent method.
}
