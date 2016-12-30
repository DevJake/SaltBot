package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container.CaDParser;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container.JCaDManager;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCaD;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.GameEndType;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by Salt001 on 18/11/2016.
 */
public class JCaDImpl implements JCaD {

    private JCaDManager game;

    /**
     * Creates a new CardsAgainstDiscord game
     *
     * @param cmd CommandParser.CommandContainer - The command entered by the user
     * @return JCaDManager - A new instance of a CardsAgainstDiscord game
     * @throws CaDException If the current instance is already associated with a game
     */
    @Override
    public JCaDManager createGame(CommandParser.CommandContainer cmd) throws CaDException {
        if (!(this.game == null)) {
            this.game = CaDParser.parseGameCreate(cmd);
        } else {
            throw new CaDException("The game has already been created!");
        }

        return game;
    }

    /**
     * Terminates the current game with a specific termination message to all users
     *
     * @param gameEndType GameEndType - The reason for the game ending
     * @param game        JCaDManager - The game instance that should be terminated
     */
    @Override
    public void endGame(GameEndType gameEndType, JCaDManager game) {
        for (CaDPlayer u : game.getPlayers()) {
            u.getPlayer().getPrivateChannel().sendMessage("The game has finished!");
        }
    }

    /**
     * Returns the JCaDManager instance for this class' current CaD game instance
     *
     * @return This game instance's JCaDManager instance
     */

    @Override
    public JCaDManager getManager() {
        return game;
    }


}
