package me.Salt.Listeners;

import me.Salt.Handlers.main;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.CommandHandler;
import net.dv8tion.jda.events.Event;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.events.voice.VoiceJoinEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

import java.util.List;

/**
 * Created by zuezy on 06/08/2016.
 */
public class EventListener extends ListenerAdapter {

    //private static FileLogger fl = new FileLogger();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        main.TotalMessageCount++;

        if (event.getAuthor().isBot()){
            main.BotMessageCount++;
        }

        if (event.getMessage().getContent().startsWith(main.cmdPrefix) && !(event.getMessage().getAuthor().isBot())) {
            main.handleCommand(new CommandParser().parse(
                    event.getMessage().getContent(), event, main.cmdPrefix));
        }
    }

    @Override
    public void onVoiceJoin(VoiceJoinEvent event) {

    }

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {

    }

    //    public void onEvent(Event event) {
//        //TODO LoggerEventDistributor led = new LoggerEventDistributor(event);
//    }
//    Uncommenting results in events not being registered. Sort out LoggerEventDistributor, then remove onEvent method.
}
