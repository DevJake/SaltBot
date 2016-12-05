package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Game;

import java.util.regex.Pattern;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CardsAgainstDiscord implements Game {
    private CaDContainer cad;

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        this.cad = new CaDParser().parse(cmd);
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
