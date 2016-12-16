package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container.JCaDManager;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions.CaDException;

/**
 * Created by Salt001 on 16/12/2016.
 * Manages the CardsAgainstDiscord game, round-by-round.
 */
public class CaDRound {
    private JCaDManager jCaD;

    /**
     * A constructor, for gathering all necessary information for further operation
     * @param JCaD JCaDManager - A CardsAgainstDiscord JCaDManager instance
     */
    public CaDRound(JCaDManager JCaD) {
        this.jCaD = JCaD;
    }

    /**
     *
     * @throws CaDException
     */
    public void nextRound() throws CaDException {

    }
}
