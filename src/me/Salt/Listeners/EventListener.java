package me.Salt.Listeners;

import me.Salt.Handlers.Main;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.events.voice.VoiceJoinEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

/**
 * Created by zuezy on 06/08/2016.
 */
public class EventListener extends ListenerAdapter {

    //private static FileLogger fl = new FileLogger();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        Main.TotalMessageCount++;

        if (event.getAuthor().isBot()) {
            Main.BotMessageCount++;
        }

        if (event.getMessage().getContent().startsWith(Main.cmdPrefix) && !(event.getMessage().getAuthor().isBot())) {
            Main.handleCommand(new CommandParser().parse(
                    event.getMessage().getContent(), event, Main.cmdPrefix));
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
