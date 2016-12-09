package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public abstract class CaDPlayer implements User {
    public CaDPlayer(User player, List<JCardImpl> deck, int score, boolean isCzar) {
        this.player = player;
        this.deck = deck;
        this.score = score;
        this.isCzar = isCzar;
    }

    public User getPlayer() {
        return player;
    }

    public List<JCardImpl> getDeck() {
        return deck;
    }

    public int getScore() {
        return score;
    }

    public boolean isCzar() {
        return isCzar;
    }

    public void setDeck(List<JCardImpl> deck) {
        this.deck = deck;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCzar(boolean czar) {
        isCzar = czar;
    }

    private User player;
    private List<JCardImpl> deck;
    private int score;
    private boolean isCzar;

}
