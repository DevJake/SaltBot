package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 06/12/2016.
 */
public class CaDParser {

    public JCaDManager parse(CommandParser.CommandContainer cmd){

        return new JCaDManager(cmd, cmd.getEvent().getAuthor(), );
    }
}
