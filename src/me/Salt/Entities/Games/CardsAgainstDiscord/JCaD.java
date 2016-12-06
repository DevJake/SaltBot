package me.Salt.Entities.Games.CardsAgainstDiscord;

import me.Salt.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 06/12/2016.
 */
public interface JCaD {

    void createGame(CommandParser.CommandContainer cmd) throws CaDException;
}

