package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JDeck;

import java.util.List;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JDeckImpl implements JDeck {
    private List<JCard> whiteCards;
    private List<JCard> blackCards;

    public JDeckImpl(List<JCard> whiteCards, List<JCard> blackCards) {
        this.whiteCards = whiteCards;
        this.blackCards = blackCards;
    }

    public List<JCard> getWhiteCards() {
        return whiteCards;
    }

    public void setWhiteCards(List<JCard> whiteCards) {
        this.whiteCards = whiteCards;
    }

    public List<JCard> getBlackCards() {
        return blackCards;
    }

    public void setBlackCards(List<JCard> blackCards) {
        this.blackCards = blackCards;
    }
}
