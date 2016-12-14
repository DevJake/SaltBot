package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 06/12/2016.
 * Receives a command entered by the user, and analyses the contained data to produce a new JCaDManager instance.
 */
public class CaDParser {
    /**
     * Parses CommandContainer instances into new JCaDManager instances.
     *
     * @param cmd CommandParser.CommandContainer - The command entered by the user
     * @return A new JCaDManager instance
     */
    public JCaDManager parse(CommandParser.CommandContainer cmd) {

        return new JCaDManager(cmd, cmd.getEvent().getAuthor(), null, 0, 0, 0, false, null, null); //TODO: Placeholder
    }
}
