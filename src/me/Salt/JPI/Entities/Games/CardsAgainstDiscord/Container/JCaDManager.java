package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.CaDPlayer;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.JFlagImpl;
import me.Salt.Parser.Command.CommandParser;
import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by Salt001 on 18/11/2016.
 * A custom Datatype, for the storage of CardsAgainstDiscord-game-related information.
 * Stores information about a specific CaD game.
 */
public class JCaDManager {
    private CommandParser.CommandContainer cmd;
    private User gameOwner;
    private List<CaDPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double selectionDelay;
    private boolean showPack; //Show pack the card originates from?
    private List<JFlagImpl> flags;
    private List<CaDPlayer> banList;

    /**
     * A constructor for the JCadManager instance.
     *
     * @param cmd            CommandParser.CommandContainer - The command entered by the user
     * @param gameOwner      User - The owner of this CardsAgainstDiscord game instance
     * @param players        List - A list of players to be invited to the game
     * @param winningScore   int - The final score required by a player to win the game
     * @param cardsPerPlayer int - How many white cards each player should be assigned
     * @param selectionDelay Double - How long to give each player to select a card, before forcefully continuing the round
     * @param showPack       Boolean - If the cardpack that the current black card originates from should be shown on-screen
     * @param flags          List - A list of flags to be used in this game instance
     * @param banList        List - A list of users banned from the current game instance
     */
    public JCaDManager(CommandParser.CommandContainer cmd, User gameOwner, List<CaDPlayer> players, int winningScore, int cardsPerPlayer, double selectionDelay, boolean showPack, List<JFlagImpl> flags, List<CaDPlayer> banList) {
        this.cmd = cmd;
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.selectionDelay = selectionDelay;
        this.showPack = showPack;
        this.flags = flags;
        this.banList = banList;
    }

    /**
     * @return List - A list of users banned from the current game instance
     */
    public List<CaDPlayer> getBanList() {
        return banList;
    }

    public void setBanList(List<CaDPlayer> banList) {
        this.banList = banList;
    }

    /**
     * @return List - A list of flags to be used in this game instance
     */
    public List<JFlagImpl> getFlags() {
        return flags;
    }

    public void setFlags(List<JFlagImpl> flags) {
        this.flags = flags;
    }

    /**
     * @return User - The owner of this CardsAgainstDiscord game instance
     */
    public User getGameOwner() {
        return gameOwner;
    }

    /**
     * @param gameOwner User - The new owner of this CardsAgainstDiscord game instance
     */
    public void setGameOwner(User gameOwner) {
        this.gameOwner = gameOwner;
    }

    /**
     * @return List - A list of players to be invited to the game
     */
    public List<CaDPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<CaDPlayer> players) {
        this.players = players;
    }

    /**
     * @return int - The final score required by a player to win the game
     */
    public int getWinningScore() {
        return winningScore;
    }

    public void setWinningScore(int winningScore) {
        this.winningScore = winningScore;
    }

    /**
     * @return int - How many white cards each player should be assigned
     */
    public int getCardsPerPlayer() {
        return cardsPerPlayer;
    }

    public void setCardsPerPlayer(int cardsPerPlayer) {
        this.cardsPerPlayer = cardsPerPlayer;
    }

    /**
     * @return Double - How long to give each player to select a card, before forcefully continuing the round
     */
    public double getSelectionDelay() {
        return selectionDelay;
    }

    public void setSelectionDelay(double selectionDelay) {
        this.selectionDelay = selectionDelay;
    }

    /**
     * @return Boolean - If the cardpack that the current black card originates from should be shown on-screen
     */
    public boolean isShowPack() {
        return showPack;
    }

    /**
     * @param showPack Boolean - If the cardpack that the current black card originates from should be shown on-screen
     */
    public void setShowPack(boolean showPack) {
        this.showPack = showPack;
    }

    /**
     * Kicks a player from this game instance.
     *
     * @param player CaDPlayer - The player to be kicked.
     * @throws CaDException Thrown if the player specified isn't in the current game.
     */
    public void kick(CaDPlayer player) throws CaDException {
        if (this.players.contains(player)) {
            this.players.remove(player);
        } else {
            throw new CaDException(player.getUsername() + "is not in this game!");
        }
    }

    /**
     * Bans a player from this game instance.
     *
     * @param player CaDPlayer - The player to be banned.
     */
    public void ban(CaDPlayer player) {
        try {
            kick(player);
        } catch (CaDException ex) {
            System.out.println(ex.getMessage());
        }

        this.banList.add(player);
    }
}

