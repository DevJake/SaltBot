package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Game;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CardsAgainstDiscord implements Game {
    private CaDContainer cad;
    public CardsAgainstDiscord(CommandParser.CommandContainer cmd){
        this.cad = new CaDParser().parse(cmd);
    }
}
