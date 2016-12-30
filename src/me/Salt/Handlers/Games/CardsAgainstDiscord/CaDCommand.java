package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;


/**
 * Created by Salt001 on 08/12/2016.
 * The Main class, for the management of the CardsAgainstDiscord game
 */
public class CaDCommand implements Command {

    private EventListener eventListener; //Declaring eventListener
    private CommandParser.CommandContainer cmd; //Declaring cmd

    /*
    Different parameters that the user can enter for the command
    u: users
    d: duration of card selection time
    l: the final score
    c: cards-per-player
    b: boolean - show card pack?
     */

    /*
    Commands that can be entered by the user (all prefixed by ".cad")
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
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        this.cmd = cmd;

        switch (cmd.getArgs()[0]) {
            case "game":
                switch (cmd.getArgs()[1]) {
                    case "create": //Create a new game. No current game must be owned.
//                        caD = new CaD(CaDParser.parseGameCreate(cmd));
                    case "start": //Start the game. Stops specific settings (e.g. flags), being modified
//                        caD.gameStart();
                    case "stop": //Stop the current game. Won't give any perks or rewards.
//                        caD.gameStop();
                    case "invite": //invite a player (or players) to the game
//                        caD.gameInvite(cmd);
                    case "kick": //Kick a player
//                        caD.gameKick(cmd);
                    case "ban": //Ban a player
//                        caD.gameBan(cmd);
                    case "cpp": //Set cards-per-player
//                        caD.setjCaDManager(caD.getjCaDManager().setCardsPerPlayer());
                    case "setflag": //Toggle state of flag activity (false, by default). Must be done before running 'start'.
                }
            case "play": //Play a card from deck
            case "deck": //View current deck
            case "players": //View current players in the game (show status: Playing (in-game), Kicked, Banned, Invited)
            case "cpp": //View cards-per-player
            case "round": //View the current round information
            case "leaderboard": //View leaderboard for current game
            case "flags": //View active flags
            default:
                cmd.getEvent().getAuthor().getPrivateChannel().sendMessage("Command not recognised!");
        }
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
