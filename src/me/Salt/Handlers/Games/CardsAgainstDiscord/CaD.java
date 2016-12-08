package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.regex.Pattern;

/**
 * Created by 15122390 on 08/12/2016.
 */
public class CaD implements Command {

    private EventListener eventListener;
    private CommandParser.CommandContainer cmd;

    //commands appended after ".cad"
    Pattern create = Pattern.compile("game create (u:(.+))\\s?(d:(\\d+))\\s?(l:(\\d+))"); //TODO: continue

    /*
    u: users
    d: duration of card selection time
    l: the final score
    c: cards-per-player
    b: boolean - show card pack?
     */

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        this.eventListener = eventListener;
        this.cmd = cmd;

        StringBuilder sb = new StringBuilder();

        for (String arg : cmd.getArgs()){
            sb.append(arg);
        }


            return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {

    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
