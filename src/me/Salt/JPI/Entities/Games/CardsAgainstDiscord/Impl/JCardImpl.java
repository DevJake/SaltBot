package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardType;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JCardImpl implements JCard {
    String text;
    CardType cardType;

    /**
     * A card constructor for WHITE cards
     *
     * @param text     String - The card's text
     * @param cardType CardType - What type of card it is
     */
    public JCardImpl(String text, CardType cardType) {
        this.text = text;
        this.cardType = cardType;
    }

    /**
     * @return CardType - The card type
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * @return String - The text on the card
     */
    public String getText() {
        return text;
    }
}
