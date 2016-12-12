package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JCardPack;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardType;

/**
 * Created by 15122390 on 07/12/2016.
 */
public class JBlackCard implements JCard {
    String name;
    String description;
    JCardPack cardpack;
    CardType cardType;
    int choiceCount; //number of cards required to be put down

    public JBlackCard(String name, String description, JCardPack cardpack, CardType cardType, int choiceCount) {
        this.name = name;
        this.description = description;
        this.cardpack = cardpack;
        this.cardType = cardType;
        this.choiceCount = choiceCount;
    }

    public int getChoiceCount() {
        return choiceCount;
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
