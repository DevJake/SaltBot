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
    private boolean showPack;

    public CaDContainer(User gameOwner, List<CaHPlayer> players, int winningScore, int cardsPerPlayer, double roundDelay, boolean showPack) {
        this.gameOwner = gameOwner;
        this.players = players;
        this.winningScore = winningScore;
        this.cardsPerPlayer = cardsPerPlayer;
        this.roundDelay = roundDelay;
        this.showPack = showPack;
    }

    public User getGameOwner() {
        return gameOwner;
    }

    public List<CaHPlayer> getPlayers() {
        return players;
    }

    public int getWinningScore() {
        return winningScore;
    }

    public int getCardsPerPlayer() {
        return cardsPerPlayer;
    }

    public double getRoundDelay() {
        return roundDelay;
    }

    public boolean isShowPack() {
        return showPack;
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
            case REGIONAL_PACK_AUSTRALIA:
                return new CardDeck(new String[]{"100% Pure New Zealand", "A bleached arsehole", "A brain tumour", "A cute, fuzzy kiala, but it has chlamydia", "A decent fucking internet connection", "A didgeridildo", "A fair go", "A five-litre goon bag", "A foetus", "A Japanese whaling operation", "A literal tornado of fire", "A sick burnout", "A six-point plan to stop the boats", "A slab of VB and a pack of durries", "A stingray barb through the chest", "Alcohol poisoning", "All four prongs of an echidna's penis", "Americanization", "A soggy Sao", "Australia", "Ball-by-ball commentary from Richie Benaud", "Boat people: Half boat, half human", "Cashed-up bogans", "Chunks of dead backpacker", "Clive Palmer's soft shitty body", "Contagious face cancer", "Crumbs all over the bloody carpet", "Daniel Radcliffe's delicious arsehole", "Dirty nappies", "Doin' it up the bum", "Dropping a baby down the dunny", "Fiery poos", "Getting married, having a few kids, buying some stuff, retiring to Queensland and dying", "Getting naked and watching Play School", "Getting so angry that you pop a stiffy", "Glassing a wanker", "Good-natured, fun-loving Aussie racism", "Half a kilo of pure Chinese white heroin", "Having a Golden Gaytime", "Having a shag in the back of the ute", "Ice", "Inserting a jam jar into my anus", "Jehovah's witnesses", "John Howard's eyebrows", "Liberals", "LYNX Body Spray", "Making up for centuries of oppression with one day of apologising", "Massive, widespread drought", "Millions of cane toads", "Mr. Squiggle, the Man from the Moon", "Nippers", "Nothing but sand", "Oestrogen", "Paedophiles", "Perfunctory foreplay", "Playing silly buggers", "Profound respect and appreciation for indigenous culture", "Rupert Murdoch", "Queen Elizabeth's immaculate anus", "Scalping the Milkybar Kid", "Skippy the Bush Kangaroo", "Some bloody peace and quiet", "Sorry, this content cannot be viewed in your region", "Steve Irwin", "Summoning Harold Holt from the sea in a time of great need", "Taking a sheep-wife", "The big fucking hole in the ozone layer", "The bush", "The cool refreshing taste of Coca-Cola", "The Great Emu War", "The White Australia Policy", "Tony Abbott in budgie smugglers", "Total control of the media", "Twenty tonnes of bat shit", "Vegemite", "Vomiting into a kangaroo's pouch", "Waking up half-naked in a Macca's car park", "Waking into a pool of children's tears", "Whiskas Catmilk", "Wiping her bum", "Women's undies", "Xenophobia"}, new String[]{"ABC presents \"_: The Story of _\"", "Are you thinking what I'm thinking B1? I think I am, B2: it's _ time!", "As my New Year's resolution, I vow to give up _", "Channel 9 is pleased to present its new variety show, \"Hey Hey It's _\"", "Crikey! I've never seen _ like this before! Let's get a bit closer", "Daddy, why is mummy crying?", "I'm sorry, Sir, but I couldn't complete my homework, because of _", "In an attempt to reach a wider audience, the National Museum of Australia has opened an interactive exhibit on _", "In Australia, _ is twice as big and twice as deadly", "Life for Aboriginal people was forever changed when the white man introduced them to _", "Next on Nine's Wide World of Sports: The World Championship of _", "Oi! Show us _!", "Qantas now prohibits _ on airplanes", "The school of excursion was completely ruined by _", "Today on Jerry Springer: \"Help! My son is _\"", "What broke up the original Wiggles?", "What did I bring back from Bali?", "What don't you want to find in your Mongolian beef?", "When I am a billionaire, I shall erect a 20-metre statue to commemorate _", "When I am Prime minister, I will create the Ministry of _"}, cardpack);
            case REGIONAL_PACK_CANADA:
            case REGIONAL_PACK_UK:
            case THE_FIRST_EXPANSION:
            case THE_SECOND_EXPANSION:
            case THE_THIRD_EXPANSION:
            case THE_FOURTH_EXPANSION:
            case THE_FIFTH_EXPANSION:
            case THE_SIXTH_EXPANSION:
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

