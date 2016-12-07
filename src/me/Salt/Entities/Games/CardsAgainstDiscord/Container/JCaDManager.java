package me.Salt.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaDGame;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaDPlayer;
import me.Salt.Entities.Games.CardsAgainstDiscord.JFlag;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class JCaDManager {
    public JCaDManager(CommandParser.CommandContainer cmd, User gameOwner, List<CaDPlayer> players, int winningScore, int cardsPerPlayer, double roundDelay, boolean showPack, List<JFlag> flags) {
        this.cmd = cmd;
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = roundDelay;
        this.showPack = showPack;
        this.flags = flags;
    }

    private CommandParser.CommandContainer cmd;
    private User gameOwner;
    private List<CaDPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double roundDelay;
    private boolean showPack; //Show pack the card originates from?
    private List<JFlag> flags;



    public CaDGame getGame() {
        return new CaDGame(cmd);
    }

    public User getGameOwner() {
        return gameOwner;
    }

    public void setGameOwner(User gameOwner) {
        this.gameOwner = gameOwner;
    }

    public List<CaDPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<CaDPlayer> players) {
        this.players = players;
    }

    public int getWinningScore() {
        return winningScore;
    }

    public int getCardsPerPlayer() {
        return cardsPerPlayer;
    }

    public double getRoundDelay() {
        return roundDelay;
    }

    public boolean isShowPack() {
        return showPack;
    }

    public void setShowPack(boolean showPack) {
        this.showPack = showPack;
    }
}

