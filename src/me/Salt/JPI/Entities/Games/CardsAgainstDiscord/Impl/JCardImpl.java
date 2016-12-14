package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardType;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JCardImpl implements JCard {
    String name;
    String description;
    JCardPackImpl cardpack;
    CardType cardType;

    public JCardImpl(String name, String description, JCardPackImpl cardpack, CardType cardType) {
        this.name = name;
        this.description = description;
        this.cardpack = cardpack;
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public JCardPackImpl getCardpack() {
        return cardpack;
    }

    public CardType getCardType() {
        return cardType;
    }

}
