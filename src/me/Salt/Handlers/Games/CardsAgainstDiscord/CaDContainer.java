package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Handlers.Games.CardsAgainstDiscord.Util.CardPacks;
import net.dv8tion.jda.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15122390 on 18/11/2016.
 */
public class CaDContainer {
    private User gameOwner;
    private List<CaHPlayer> players;
    private int winningScore;
    private int cardsPerPlayer;
    private double roundDelay;

    public CardDeck getDeck(CardPacks cardpack) {
        switch (cardpack) {
            case BASE_GAME_1: return new CardDeck(new String[]{"John"}, new String[]{"Me"});
            case BASE_GAME_1_3: return new CardDeck(new String[]{}, new String[]{});
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

}
