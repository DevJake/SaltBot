package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardType;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JBlackCard extends JCardImpl implements JCard {
    int choiceCount; //number of cards required to be put down

    /**
     * A constructor for a new Black card
     *
     * @param text        String - The text on the card
     * @param cardType    CardType - What type of card it is (WHITE or BLACK)
     * @param choiceCount Integer - How many cards should be placed by each player
     */
    public JBlackCard(String text, CardType cardType, int choiceCount) {
        super(text, cardType);
        this.choiceCount = choiceCount;
    }

    /**
     * @return Integer - The number of white cards required to be placed down for this black card
     */
    public int getChoiceCount() {
        return choiceCount;
    }
}
