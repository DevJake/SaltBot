package me.Salt.Handlers.Games.CardsAgainstDiscord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CardDeck {

    public List<String> getWhiteCards() {
        return whiteCards;
    }

    public List<String> getBlackCards() {
        return blackCards;
    }

    private List<String> whiteCards;
    private List<String> blackCards;

    public CardDeck(String[] whiteCards, String[] blackCards) {
        this.whiteCards = Arrays.asList(whiteCards);
        this.blackCards = Arrays.asList(blackCards);
    }
}
