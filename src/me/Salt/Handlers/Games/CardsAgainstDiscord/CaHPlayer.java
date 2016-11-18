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
    private boolean isTurn;

    public CaHPlayer(User player, List<String> deck, int score, boolean isTurn) {
        this.player = player;
        this.deck = deck;
        this.score = score;
        this.isTurn = isTurn;
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

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

}
