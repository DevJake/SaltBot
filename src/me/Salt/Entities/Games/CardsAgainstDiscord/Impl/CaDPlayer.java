package me.Salt.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.Entities.Games.CardsAgainstDiscord.JCard;
import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaDPlayer implements User {
    public CaDPlayer(User player, List<JCard> deck, int score, boolean isCzar) {
        this.player = player;
        this.deck = deck;
        this.score = score;
        this.isCzar = isCzar;
    }

    public User getPlayer() {
        return player;
    }

    public List<JCard> getDeck() {
        return deck;
    }

    public int getScore() {
        return score;
    }

    public boolean isCzar() {
        return isCzar;
    }

    public void setDeck(List<JCard> deck) {
        this.deck = deck;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCzar(boolean czar) {
        isCzar = czar;
    }

    private User player;
    private List<JCard> deck;
    private int score;
    private boolean isCzar;

}
