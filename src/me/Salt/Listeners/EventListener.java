package me.Salt.Listeners;

import me.Salt.Commands.Admin.MuteCommand;
import me.Salt.Handlers.Main;
import me.Salt.Handlers.MuteHandler.MuteHandler;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;
import me.Salt.Util.CommandHandler;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.events.voice.VoiceJoinEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

import java.util.List;

/**
 * Created by zuezy on 06/08/2016.
 */
public class EventListener extends ListenerAdapter {

    private List<CommandHandler> waiters;
    //private static FileLogger fl = new FileLogger();

    public void register(CommandHandler cmdhandle){
        waiters.add(cmdhandle);
    }

    public boolean unregister(CommandHandler cmdhandle){
        if (waiters.contains(cmdhandle)){
            waiters.remove(cmdhandle);
            return true;
        }
        return false;
    }

    private boolean isCmdSafe(String content, Boolean isBot) {
        return (content.startsWith(Main.cmdPrefix) && !isBot);
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        for (CommandHandler waiter : waiters){
            waiter.receive(event);
        }

        if (isCmdSafe(event.getMessage().getContent(), event.getMessage().getAuthor().isBot())) {
            Main.handleCommand(new CommandParser().parse(
                    event.getMessage().getContent(), event, Main.cmdPrefix));
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
