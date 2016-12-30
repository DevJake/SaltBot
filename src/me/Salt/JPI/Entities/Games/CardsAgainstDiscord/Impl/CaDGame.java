package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flags;
import me.Salt.Parser.Command.CommandParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Salt001 on 05/12/2016.
 */
public class CaDGame {

    private CommandParser.CommandContainer cmd;

    private Pattern flag = Pattern.compile("(--\\w+)");

    /**
     * A constructor for the CaDGame class
     *
     * @param cmd CommandParser.CommandContainer - The command entered by the user that triggered the instantiation of this class
     */
    public CaDGame(CommandParser.CommandContainer cmd) {
        this.cmd = cmd;
    }

    /**
     * Returns a list of flags currently activated in the game
     *
     * @return List - A list of flags currently activated in this game session
     */
    public List<Flag> getFlags() {
        List<Flag> flags = new ArrayList<>();
        for (int i = 0; i < flag.matcher(cmd.getRaw()).groupCount(); i++) {
            switch (flag.matcher(cmd.getRaw()).group(i)) {
                case "--inverse":
                    flags.add(new Flag(Flags.INVERSE));
                case "--showpack":
                    flags.add(new Flag(Flags.SHOW_PACK));

            }
        }

        return flags;
    }


}


