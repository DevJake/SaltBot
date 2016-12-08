package me.Salt.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaDGame;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaDPlayer;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.JFlagImpl;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class JCaDManager {
    private CommandParser.CommandContainer cmd;
    private User gameOwner;
    private List<CaDPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double roundDelay;
    private boolean showPack; //Show pack the card originates from?
    private List<JFlagImpl> flags;
    private List<CaDPlayer> banList;

    public JCaDManager(CommandParser.CommandContainer cmd, User gameOwner, List<CaDPlayer> players, int winningScore, int cardsPerPlayer, double roundDelay, boolean showPack, List<JFlagImpl> flags, List<CaDPlayer> banList) {
        this.cmd = cmd;
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = roundDelay;
        this.showPack = showPack;
        this.flags = flags;
        this.banList = banList;
    }

    public List<CaDPlayer> getBanList() {
        return banList;
    }

    public List<JFlagImpl> getFlags() {
        return flags;
    }

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

    public void invite(CaDPlayer player) {

    }

    public void kick(CaDPlayer player) throws CaDException {
        if (this.players.contains(player)) {
            this.players.remove(player);
        } else {
            throw new CaDException(player.getUsername() + "is not in this game!");
        }
    }

    public void ban(CaDPlayer player) {
        try {
            kick(player);
        } catch (CaDException ex) {
            System.out.println(ex.getMessage());
        }

        this.banList.add(player);
    }
}

