package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 06/12/2016.
 */
public class JCaDManagerParser {

    public JCaDManager parse(CommandParser.CommandContainer cmd){
        for (String arg : cmd.getArgs()){
            if (arg.startsWith("u:")){

            } else if (arg.startsWith())
        }

        return new JCaDManager(cmd, cmd.getEvent().getAuthor(), null, 0, 0, 0.0, false, null, null);
    }
}
