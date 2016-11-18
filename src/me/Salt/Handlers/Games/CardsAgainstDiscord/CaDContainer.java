package me.Salt.Handlers.Games.CardsAgainstDiscord;

import me.Salt.Handlers.Games.CardsAgainstDiscord.Exceptions.NoCardpackException;
import me.Salt.Handlers.Games.CardsAgainstDiscord.Util.CardPack;
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
    public CaDContainer(User gameOwner, List<CaHPlayer> players, int winningScore, int cardsPerPlayer, double roundDelay) {
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = roundDelay;
    }
    //TODO: Add 'Flags' setting, so custom game rules can be enabled on game-launch

    public CardDeck getDeck(CardPack cardpack) throws NoCardpackException {
        //TODO: modify from hardcode to allow users to edit pack contents, such as via a file
        switch (cardpack) {
            case BASE_GAME_1:
                return new CardDeck(new String[]{"Abstinence", "Goats eating coins", "Inappropriate yelling", "The plot of a Michael bay movie", "The Red Menace", "Vehicular homicide"}, new String[]{"Sorry everyone, I just _", "What's the next superhero?", "When I'm in prison, I'll have _ smuggled in", "Who stole the cookies from the cookie jar?"}, cardpack);
            case BASE_GAME_1_3:
                return new CardDeck(new String[]{"A caress of the inner thigh", "Filling Sean Hannity with helium and watching him float away", "The homosexual lifestyle"}, null, cardpack);
            case BASE_GAME_1_5:
                return new CardDeck(new String[]{"Swag"}, null, cardpack);
            case BASE_GAME_1_6:
                return new CardDeck(new String[]{"A ball of earwax, semen and toenail clippings", "A Fleshlight", "A man on the brink of orgasm", "A saxophone solo", "An endless stream of diarrhoea", "Bio-engineered assault turtles with acid breath", "Chunks of dead hitchhiker", "Court-ordered rehab", "Crumbs all over the god damn carpet", "Daniel Radcliffe's delicious asshole", "Dark and mysterious forces beyond our control", "Giving birth to the Antichrist", "Having anuses for eyes", "Hip hop jewels", "Holding down a child and farting all over him", "Inserting a Mason jar into my anus", "Invading Poland", "Jobs", "Joe Biden", "Magnets", "Miley Cyrus at 55", "My black ass", "Our first chimpanzee President", "Penis breath", "Running out of semen", "Saying \"I love you.\"", "Seeing Grandma naked", "Sex with Patrick Stewart", "Sexual peeing", "The cool, refreshing taste of Pepsi", "The morbidly obese", "The Patriarchy", "The pirate's life", "The rhythms of Africa", "The wonders of the Orient", "The wrath of Vladimir Putin", "This years mass shooting", "Three dicks at the same time", "White-man scalps", "Your weird brother"}, new String[]{"A recent laboratory study shows that undergraduates have 50% less sex after being exposed to _", "Fun tip! When your man asks you to go down on him, try surprising him with _ instead", "I get by with a little help from _", "Introducing the amazing superhero/sidekick duo! It's _ and _!", "Introducing X-Treme Baseball! It's like baseball, but with _!", "The new Chevy Tahoe. With the power and space to take _ everywhere you go", "They said we were crazy. They said we couldn't put _ inside of _. They were wrong", "Today on Maury: \"Help! My son is _!\"", "What is George W. Bush thinking about right now?"}, cardpack);
            default:
                throw new NoCardpackException();
        }
    }

    public List<CardDeck> getDeck(List<CardPack> cardpack) throws NoCardpackException {
        List<CardDeck> cardDecks = new ArrayList<>();
        for (CardPack pack : cardpack) {
            cardDecks.add(getDeck(pack));
        }
        return cardDecks;
    }

}

