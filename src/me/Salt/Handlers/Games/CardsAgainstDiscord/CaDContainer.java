package me.Salt.Handlers.Games.CardsAgainstDiscord;

import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaDContainer {
    private User gameOwner;
    private List<CaHPlayer> players;
    private List<Cards> cardpacks;
    private int winningScore;
    private int cardsPerPlayer;

    public CaDContainer(User gameOwner, List<CaHPlayer> players, List<Cards> cardpacks, int winningScore, int cardsPerPlayer) {
        this.gameOwner = gameOwner;
        this.players = players;
        this.cardpacks = cardpacks;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
    }

    public int getCardsPerPlayer() {
        return cardsPerPlayer;
    }

    public User getGameOwner() {
        return gameOwner;
    }

    public void setGameOwner(User gameOwner) {
        this.gameOwner = gameOwner;
    }

    public List<CaHPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<CaHPlayer> players) {
        this.players = players;
    }

    public List<Cards> getCardpacks() {
        return cardpacks;
    }

    public int getWinningScore() {
        return winningScore;
    }

}
