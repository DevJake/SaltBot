package me.Salt.Listeners;

import me.Salt.Handlers.main;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.CommandHandler;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.events.voice.VoiceJoinEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

import java.util.List;

/**
 * Created by zuezy on 06/08/2016.
 */
public class EventListener extends ListenerAdapter {

    //private static FileLogger fl = new FileLogger();
    private List<CommandHandler> waiters;

    public void register(CommandHandler cmdhandle) {
        waiters.add(cmdhandle);
    }

    public boolean unregister(CommandHandler cmdhandle) {
        if (waiters.contains(cmdhandle)) {
            waiters.remove(cmdhandle);
            return true;
        }
        return false;
    }

    private boolean isCmdSafe(String content, Boolean isBot) {
        return (content.startsWith(main.cmdPrefix) && !isBot);
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        main.TotalMessageCount++;

        if (event.getAuthor().isBot()){
            main.BotMessageCount++;
        }

        if (isCmdSafe(event.getMessage().getContent(), event.getMessage().getAuthor().isBot())) {
            main.handleCommand(new CommandParser().parse(
                    event.getMessage().getContent(), event, main.cmdPrefix));
        }
    }

    @Override
    public void onVoiceJoin(VoiceJoinEvent event) {

    }

    //    public void onEvent(Event event) {
//        //TODO LoggerEventDistributor led = new LoggerEventDistributor(event);
//    }
//    Uncommenting results in events not being registered. Sort out LoggerEventDistributor, then remove onEvent method.
}
