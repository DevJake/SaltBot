package me.Salt.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.Entities.Games.CardsAgainstDiscord.Exceptions.NoCardpackException;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaDGame;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CaHPlayer;
import me.Salt.Entities.Games.CardsAgainstDiscord.Impl.CardDeck;
import me.Salt.Entities.Games.CardsAgainstDiscord.Util.CardPack;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaDContainer {
    private CommandParser.CommandContainer cmd;
    private User gameOwner;
    private List<CaHPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double roundDelay;
    private boolean showPack; //Show pack the card originates from?

    public CaDContainer(CommandParser.CommandContainer cmd, User gameOwner, List<CaHPlayer> players, int winningScore, int cardsPerPlayer, double roundDelay, boolean showPack) {
        this.cmd = cmd;
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = roundDelay;
        this.showPack = showPack;
    }

    public CaDGame getGame() {
        return new CaDGame(cmd);
    }

    public User getGameOwner() {
        return gameOwner;
    }

    public List<CaHPlayer> getPlayers() {
        return players;
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


    //TODO: Add 'Flags' setting, so custom game rules can be enabled on game-launch

    public CardDeck getDeck(CardPack cardpack) throws NoCardpackException {

        //TODO: modify from hardcode to allow users to edit pack contents, such as via a file
        switch (cardpack) {

            default:
                throw new NoCardpackException("The pack selected (\"" + cardpack.name() + "\"), has not yet been implemented");
        }
    }

    public List<CardDeck> getDeck(List<CardPack> cardpack) throws NoCardpackException {
        List<CardDeck> cardDecks = new ArrayList<>();
        for (CardPack pack : cardpack) {
            cardDecks.add(getDeck(pack));
        }
        return cardDecks;
    }

}

