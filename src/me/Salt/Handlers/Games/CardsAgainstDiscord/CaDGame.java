package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Handlers.Games.CardsAgainstDiscord.Util.Flag;
import me.Salt.Handlers.Games.CardsAgainstDiscord.Util.Flags;
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

    public List<Flag> getFlags() {
        List<Flag> flags = new ArrayList<>();
        for (int i = 0; i<flag.matcher(cmd.getRaw()).groupCount();i++){
            switch (flag.matcher(cmd.getRaw()).group(i)){
                case "--inverse":
                    flags.add(new Flag(Flags.INVERSE));
                case "--showpack":
                    flags.add(new Flag(Flags.SHOW_PACK));

            }
        }

        return flags;
    }


}


