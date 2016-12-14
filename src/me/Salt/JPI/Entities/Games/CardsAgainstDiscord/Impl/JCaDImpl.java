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

    @Override
    public JCaDManager createGame(CommandParser.CommandContainer cmd) throws CaDException {
        if (!(this.game == null)) {
            this.game = new CaDParser().parse(cmd);
        } else {
            throw new CaDException("The game has already been created!");
        }

        return game;
    }

    @Override
    public void endGame(GameEndType gameEndType, JCaDManager game) {
        for (CaDPlayer u : game.getPlayers()) {
            u.getPlayer().getPrivateChannel().sendMessage("The game has finished!");
        }
    }


    @Override
    public JCaDManager getManager() {
        return game;
    }


}
