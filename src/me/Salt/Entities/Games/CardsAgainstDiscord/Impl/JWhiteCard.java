package me.Salt.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.Entities.Games.CardsAgainstDiscord.JCardPack;
import me.Salt.Entities.Games.CardsAgainstDiscord.Util.CardType;

/**
 * Created by 15122390 on 07/12/2016.
 */
public class JWhiteCard implements JCard {
    String name;
    String description;
    JCardPack cardpack;
    CardType cardType;

    public JWhiteCard(String name, String description, JCardPack cardpack, CardType cardType) {
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

    public JCardPack getCardpack() {
        return cardpack;
    }

    public CardType getCardType() {
        return cardType;
    }

}
