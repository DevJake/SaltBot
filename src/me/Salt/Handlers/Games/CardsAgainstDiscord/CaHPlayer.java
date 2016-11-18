package me.Salt.Handlers.Games.CardsAgainstDiscord;

import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaHPlayer {
    private User player;
    private List<String> deck;
    private int score;
    private boolean isCzar;

    public CaHPlayer(User player, List<String> deck, int score, boolean isCzar) {
        this.player = player;
        this.deck = deck;
        this.score = score;
        this.isCzar = isCzar;
    }

    public User getPlayer() {
        return player;
    }

    public List<String> getDeck() {
        return deck;
    }

    public void setDeck(List<String> deck) {
        this.deck = deck;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isCzar() {
        return isCzar;
    }

    public void setCzar(boolean czar) {
        isCzar = czar;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

}
