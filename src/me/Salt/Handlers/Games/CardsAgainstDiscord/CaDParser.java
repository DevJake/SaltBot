package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Parser.Command.CommandParser;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaDParser {

    public CaDContainer parse(CommandParser.CommandContainer cmd){

        String[] users;
        for (String arg : cmd.getArgs()){

        }



        return new CaDContainer(cmd.getEvent().getAuthor(), );
    }
}
