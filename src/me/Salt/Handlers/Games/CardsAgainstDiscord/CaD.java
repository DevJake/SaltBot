package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;


/**
 * Created by 15122390 on 08/12/2016.
 */
public class CaD implements Command {

    private EventListener eventListener;
    private CommandParser.CommandContainer cmd;

    /*
    u: users
    d: duration of card selection time
    l: the final score
    c: cards-per-player
    b: boolean - show card pack?
     */

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        this.eventListener = eventListener;
        this.cmd = cmd;

        switch (cmd.getArgs()[0]) {
            case "game":
                switch (cmd.getArgs()[1]) {
                    case "create": //Create a new game. No current game must be owned.
                    case "start": //Start the game. Stops specific settings (e.g. flags), being modified
                    case "stop": //Stop the current game. Won't give any perks or rewards.
                    case "invite": //invite a player (or players) to the game
                    case "kick": //Kick a player
                    case "ban": //Ban a player
                    case "cpp": //Set cards-per-player
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
                return false;
        }
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {

    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
