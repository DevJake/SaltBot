package me.Salt.JPI.Entities.Games.CardsAgainstDiscord;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container.JCaDManager;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.GameEndType;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 06/12/2016.
 * An interface for the core of the CardsAgainstDiscord game
 */
public interface JCaD {

    me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container.JCaDManager createGame(CommandParser.CommandContainer cmd) throws CaDException;

    void endGame(GameEndType gameEndType, JCaDManager game);

    JCaDManager getManager();


}

