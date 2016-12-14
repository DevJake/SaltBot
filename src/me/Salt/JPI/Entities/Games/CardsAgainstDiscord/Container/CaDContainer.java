package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions.NoCardpackException;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.CaDGame;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.CaDPlayer;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.CardDeck;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardPack;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Salt001 on 18/11/2016.
 */
public class CaDContainer {
    private CommandParser.CommandContainer cmd;
    private User gameOwner;
    private List<CaDPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double roundDelay;
    private boolean showPack; //Show pack the card originates from?

    /**
     * Constructs a new CardsAgainstDiscord game container
     *
     * @param cmd            CommandParser.CommandContainer - The command entered by the user
     * @param gameOwner      User - The owner of the CaD game
     * @param players        List - A list of players that the game will initially contain
     * @param winningScore   Integer - The final score required to reach an end-game state
     * @param cardsPerPlayer Integer - How many white cards each player should have
     * @param selectionDelay Double - How long to give each player to select a card, before forcefully continuing the round
     * @param showPack       Boolean - If the cardpack that the current black card originates from should be shown on-screen
     */
    public CaDContainer(CommandParser.CommandContainer cmd, User gameOwner, List<CaDPlayer> players, int winningScore, int cardsPerPlayer, double selectionDelay, boolean showPack) {
        this.cmd = cmd;
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = selectionDelay;
        this.showPack = showPack;
    }

    public CaDGame getGame() {
        return new CaDGame(cmd);
    }

    public User getGameOwner() {
        return gameOwner;
    }

    public List<CaDPlayer> getPlayers() {
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

