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
    private double roundDelay;


}
