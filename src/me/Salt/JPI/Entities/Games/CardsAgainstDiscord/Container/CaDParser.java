package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Parser.Command.CommandParser;

import java.util.regex.Pattern;

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
    public static JCaDManager parseGameCreate(CommandParser.CommandContainer cmd) {

        return new JCaDManager(cmd, cmd.getEvent().getAuthor(), null, 0, 0, 0, false, null, null); //TODO: Placeholder
    }

    /*
-> game create
-> game start
-> game stop
-> game invite
-> game kick
-> game ban
-> game cpp
-> game setflag

-> play
-> deck
-> players
-> cpp
-> round
-> leaderboard
-> flags
 */

//    public static int parseCpp(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameStart(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameInvite(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameKick(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameBan(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameCpp(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseGameSetFlag(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parsePlay(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseDeck(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parsePlayers(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseRound(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseLeaderboard(CommandParser.CommandContainer cmd) {
//
//    }
//
//    public static int parseFlags(CommandParser.CommandContainer cmd) {
//
//    }
//
//    /**
//     * Removes the first x amount of arguments from the argument StringArray.
//     *
//     * @param cmd    CommandParser.CommandContainer - The command to use for argument stripping
//     * @param indent int - How many first arguments to be stripped
//     * @return cmd, with indent first arguments removed
//     */
//    private CommandParser.CommandContainer strip(CommandParser.CommandContainer cmd, int indent) {
//        String raw = Pattern.compile();
//        return new CommandParser().parse();
//    }

}



