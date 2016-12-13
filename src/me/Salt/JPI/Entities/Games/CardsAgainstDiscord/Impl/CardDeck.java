package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardPack;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CardDeck {

    private List<String> whiteCards;
    private List<String> blackCards;
    private CardPack cardPack;

    public CardDeck(String[] whiteCards, String[] blackCards, CardPack cardPack) {
        this.whiteCards = Arrays.asList(whiteCards);
        this.blackCards = Arrays.asList(blackCards);
    }

    public List<String> getWhiteCards() {
        return whiteCards;
    }

    public List<String> getBlackCards() {
        return blackCards;
    }

    public CardPack getCardPack() {
        return cardPack;
    }
}
