package me.Salt.Handlers.Games.CardsAgainstDiscord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class Cards {

    public CardDeck getDeck(CardPacks cardpack) {
        switch (cardpack) {
            case BASE_GAME_1:
                return new CardDeck(new String[]{"John"}, new String[]{"Me"});
            default:
                return null;
        }
    }

    public List<CardDeck> getDeck(List<CardPacks> cardpack) {
        List<CardDeck> cardDecks = new ArrayList<>();
        for (CardPacks pack : cardpack) {
            switch (pack) {
                case BASE_GAME_1:
                    cardDecks.add(new CardDeck(new String[]{"John"}, new String[]{"Me"}));
                default:
                    return null;
            }
        }

        return cardDecks.size() > 0 ? cardDecks : null;
    }

    public List<String> getBlackCards(CardPacks cardpack) {

    }
}
