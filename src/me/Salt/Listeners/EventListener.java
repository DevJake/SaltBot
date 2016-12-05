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

        if (event.getAuthor().getId().equals("112633500447838208")){
            event.getAuthor().getPrivateChannel().sendMessage("Controls for **Cards Against Discord** are simple. " +
                    "\nTo begin a game, type `.cah start`. To invite players, use `.cad invite [Username, part-username, or ID]`" +
                    "\nEvery game will, by default, use the base cardpack. " +
                    "For a list of cardpacks, use `.cad pack list`" +
                    "\nTo add cardpacks, use `.cad pack add [Pack name, part name or ID]`" +
                    "\n\nWhen you begin a game, your commands -- unless an already existing command -- are read as text contained in your card of choice." +
                    "\nYou will be presented with information about the round, each round. This includes: " +
                    "\n-> The Card Czar" +
                    "\n-> The black card" +
                    "\n-> Your white cards" +
                    "\n\nTo select a card, use `.[partial card content or card-ID]`" +
                    "\nTo verify you have selected the correct cards, you will receive a confirmation message. " +
                    "\n\nWhen playing as the Card Czar, you will be notified. You will also be notified on the previous round, " +
                    "and can use `.cad players` to view the playing users, listed in order of Card Czar selection. " +
                    "\nTo select a card, use `.[partial card content or card-ID]`" +
                    "\n\nYour objective is to answer with the most fitting card(s) possible. The player who finishes with the most black cards wins the game.");
        }
    }

    //    public void onEvent(Event event) {
//        //TODO LoggerEventDistributor led = new LoggerEventDistributor(event);
//    }
//    Uncommenting results in events not being registered. Sort out LoggerEventDistributor, then remove onEvent method.
}
