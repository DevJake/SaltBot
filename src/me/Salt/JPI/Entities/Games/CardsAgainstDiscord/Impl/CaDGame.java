package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag;
import me.Salt.Parser.Command.CommandParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by 15122390 on 05/12/2016.
 */
public class CaDGame {

    private CommandParser.CommandContainer cmd;

    private Pattern flag = Pattern.compile("(--\\w+)");

    public CaDGame(CommandParser.CommandContainer cmd) {
        this.cmd = cmd;
    }

    public List<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.Flag> getFlags() {
        List<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.Flag> flags = new ArrayList<>();
        for (int i = 0; i<flag.matcher(cmd.getRaw()).groupCount();i++){
            switch (flag.matcher(cmd.getRaw()).group(i)){
                case "--inverse":
                    flags.add(new me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.Flag(Flag.INVERSE));
                case "--showpack":
                    flags.add(new me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.Flag(Flag.SHOW_PACK));

            }
        }

        return flags;
    }


}


