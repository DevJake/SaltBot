package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Container;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.JBlackCard;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.JCardImpl;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl.JCardPackImpl;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JFlag;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JPerk;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.CardType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Salt001 on 23/12/2016.
 * A custom Datatype, for the storage of CardsAgainstDiscord-game-related information.
 * Stores information about consistent data in CaD (default carddecks, perks, flags, etc.)
 */
public class CaDInfo {
    private static List<JCardPackImpl> cardPacks = new ArrayList<>();
    private static List<JPerk> perks = new ArrayList<>();
    private static List<JFlag> flags = new ArrayList<>();
    private static List<JCardImpl> cards = new ArrayList<>();

    /**
     * Initialises all data
     */
    public static void init() {

        /*
        Base Game 1.0
         */
        cards.add(new JCardImpl("Abstinence.", CardType.WHITE));
        cards.add(new JCardImpl("Goats eating coins.", CardType.WHITE));
        cards.add(new JCardImpl("Inappropriate yelling.", CardType.WHITE));
        cards.add(new JCardImpl("The plot of a Michael Bay movie.", CardType.WHITE));
        cards.add(new JCardImpl("The Red menace.", CardType.WHITE));
        cards.add(new JCardImpl("Vehicular homicide.", CardType.WHITE));

        cards.add(new JBlackCard("Sorry everyone, I just _", CardType.BLACK, 1));
        cards.add(new JBlackCard("What's the next superhero?", CardType.BLACK, 1));
        cards.add(new JBlackCard("When I'm in prison, I'll have _ smuggled in.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Who stole the cookies from the cookie jar?", CardType.BLACK, 1));

        cardPacks.add(new JCardPackImpl("Base Game 1.0", "Version 1.0 of the base game.", "Cards Against Humanity", cards));

        cards.clear();
        /*
        Base Game 1.3
         */
        cards.add(new JCardImpl("A caress of the inner thigh.", CardType.WHITE));
        cards.add(new JCardImpl("Filling Sean Hannity with helium and watching him float away.", CardType.WHITE));
        cards.add(new JCardImpl("The homosexual lifestyle.", CardType.WHITE));

        cardPacks.add(new JCardPackImpl("Base Game 1.3", "Version 1.3 of the base game.", "Cards Against Humanity", cards));

        cards.clear();

        /*
        Base Game 1.5
         */
        cards.add(new JCardImpl("Swag", CardType.WHITE));

        cardPacks.add(new JCardPackImpl("Base Game 1.5", "Version 1.5 of the base game.", "Cards Against Humanity", cards));

        cards.clear();

        /*
        Base Game 1.6
         */
        cards.add(new JCardImpl("A ball of earwax, semen, and toenail clippings.", CardType.WHITE));
        cards.add(new JCardImpl("A Fleshlight.", CardType.WHITE));
        cards.add(new JCardImpl("A man on the brink of orgasm.", CardType.WHITE));
        cards.add(new JCardImpl("A saxophone solo.", CardType.WHITE));
        cards.add(new JCardImpl("An endless stream of diarrhoea", CardType.WHITE));
        cards.add(new JCardImpl("Bio-engineered assault turtles with acid breath.", CardType.WHITE));
        cards.add(new JCardImpl("Chunks of dead hitchhiker.", CardType.WHITE));
        cards.add(new JCardImpl("Court-ordered rehab.", CardType.WHITE));
        cards.add(new JCardImpl("Crumbs all over the god damn carpet.", CardType.WHITE));
        cards.add(new JCardImpl("Daniel Radcliffe's delicious asshole.", CardType.WHITE));
        cards.add(new JCardImpl("Dark and mysterious forces beyond our control.", CardType.WHITE));
        cards.add(new JCardImpl("Giving birth to the Antichrist.", CardType.WHITE));
        cards.add(new JCardImpl("Having anuses for eyes.", CardType.WHITE));
        cards.add(new JCardImpl("Hip hop jewels.", CardType.WHITE));
        cards.add(new JCardImpl("Holding down a child and farting all over him.", CardType.WHITE));
        cards.add(new JCardImpl("Inserting a Mason jar into my anus.", CardType.WHITE));
        cards.add(new JCardImpl("Invading Poland.", CardType.WHITE));
        cards.add(new JCardImpl("Jobs.", CardType.WHITE));
        cards.add(new JCardImpl("Joe Biden.", CardType.WHITE));
        cards.add(new JCardImpl("Magnets.", CardType.WHITE));
        cards.add(new JCardImpl("Miley Cyrus at 55.", CardType.WHITE));
        cards.add(new JCardImpl("My black ass.", CardType.WHITE));
        cards.add(new JCardImpl("Our first chimpanzee President.", CardType.WHITE));
        cards.add(new JCardImpl("Penis breath.", CardType.WHITE));
        cards.add(new JCardImpl("Running out of semen.", CardType.WHITE));
        cards.add(new JCardImpl("Saying \"I love you\"", CardType.WHITE));
        cards.add(new JCardImpl("Seeing Grandma naked.", CardType.WHITE));
        cards.add(new JCardImpl("Sex with Patrick Stewart.", CardType.WHITE));
        cards.add(new JCardImpl("Sexual peeing.", CardType.WHITE));
        cards.add(new JCardImpl("The cool, refreshing taste of Pepsi®.", CardType.WHITE));
        cards.add(new JCardImpl("The morbidly obese.", CardType.WHITE));
        cards.add(new JCardImpl("The Patriarchy.", CardType.WHITE));
        cards.add(new JCardImpl("The pirate's life.", CardType.WHITE));
        cards.add(new JCardImpl("The rhythms of Africa.", CardType.WHITE));
        cards.add(new JCardImpl("The wonders of the Orient.", CardType.WHITE));
        cards.add(new JCardImpl("The wrath of Vladimir Putin.", CardType.WHITE));
        cards.add(new JCardImpl("This year's mass shooting.", CardType.WHITE));
        cards.add(new JCardImpl("Three dicks at the same time.", CardType.WHITE));
        cards.add(new JCardImpl("White-man scalps.", CardType.WHITE));
        cards.add(new JCardImpl("Your weird brother.", CardType.WHITE));

        cards.add(new JBlackCard("A recent laboratory study shows that undergraduates have 50% less sex after being exposed to _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Fun tip! When your man asks you to go down on him, try surprising him with _ instead.", CardType.BLACK, 1));
        cards.add(new JBlackCard("I get by with a little help from _", CardType.BLACK, 1));
        cards.add(new JBlackCard("Introducing the amazing superhero/sidekick duo! It's _ and _!", CardType.BLACK, 2));
        cards.add(new JBlackCard("Introducing X-Treme Baseball! It's like baseball, but with _!", CardType.BLACK, 1));
        cards.add(new JBlackCard("The new Chevy Tahoe. With the power and space to take _ everywhere you go.", CardType.BLACK, 1));
        cards.add(new JBlackCard("They said we were crazy. They said we couldn't put _ inside of _. They were wrong.", CardType.BLACK, 2));
        cards.add(new JBlackCard("Today on Maury: \"Help! My Son is _!\"", CardType.BLACK, 1));

        cardPacks.add(new JCardPackImpl("Base Game 1.6", "Version 1.6 of the base game.", "Cards Against Humanity", cards));

        cards.clear();
        /*
        Base Game - Australia
         */
        cards.add(new JCardImpl("100% Pure New Zealand.", CardType.WHITE));
        cards.add(new JCardImpl("A bleached arsehole.", CardType.WHITE));
        cards.add(new JCardImpl("A brain tumour.", CardType.WHITE));
        cards.add(new JCardImpl("A cute, fuzzy koala, but it has chlamydia.", CardType.WHITE));
        cards.add(new JCardImpl("A decent fucking internet connection.", CardType.WHITE));
        cards.add(new JCardImpl("A didgeridildo.", CardType.WHITE));
        cards.add(new JCardImpl("A fair go.", CardType.WHITE));
        cards.add(new JCardImpl("A five-litre goon bag.", CardType.WHITE));
        cards.add(new JCardImpl("A foetus.", CardType.WHITE));
        cards.add(new JCardImpl("A Japanese whaling operation.", CardType.WHITE));
        cards.add(new JCardImpl("A literal tornado of fire.", CardType.WHITE));
        cards.add(new JCardImpl("A sick burnout.", CardType.WHITE));
        cards.add(new JCardImpl("A six-point plan to stop the boats.", CardType.WHITE));
        cards.add(new JCardImpl("A slab of VB and a pack of durries.", CardType.WHITE));
        cards.add(new JCardImpl("A stingray barb through the chest.", CardType.WHITE));
        cards.add(new JCardImpl("Alcohol poisoning.", CardType.WHITE));
        cards.add(new JCardImpl("All four prongs of an echudna's penis.", CardType.WHITE));
        cards.add(new JCardImpl("Americanization.", CardType.WHITE)); //Also coincidentally spelt in the American format
        cards.add(new JCardImpl("A soggy Sao.", CardType.WHITE));
        cards.add(new JCardImpl("Australia.", CardType.WHITE));
        cards.add(new JCardImpl("Ball-by-ball commentary from Richie Benaud.", CardType.WHITE));
        cards.add(new JCardImpl("Boat people: Half boat, half human.", CardType.WHITE));
        cards.add(new JCardImpl("Cashed-up bogans.", CardType.WHITE));
        cards.add(new JCardImpl("Chunks of dead backpacker.", CardType.WHITE));
        cards.add(new JCardImpl("Clive Palmer's soft shitty body.", CardType.WHITE));
        cards.add(new JCardImpl("Contagious face cancer.", CardType.WHITE));
        cards.add(new JCardImpl("Crumbs all over the bloody carpet.", CardType.WHITE));
        cards.add(new JCardImpl("Daniel Radcliffe's delicious arsehole.", CardType.WHITE));
        cards.add(new JCardImpl("Dirty nappies.", CardType.WHITE));
        cards.add(new JCardImpl("Doin' it up the bum.", CardType.WHITE));
        cards.add(new JCardImpl("Dropping a baby down the dunny.", CardType.WHITE));
        cards.add(new JCardImpl("Fiery poos.", CardType.WHITE));
        cards.add(new JCardImpl("Getting married, having a few kids, buying some stuff, retiring to Queensland and dying.", CardType.WHITE));
        cards.add(new JCardImpl("Getting naked and watching Play School.", CardType.WHITE));
        cards.add(new JCardImpl("Getting so angry that you pop a stiffy.", CardType.WHITE));
        cards.add(new JCardImpl("Glassing a wanker.", CardType.WHITE));
        cards.add(new JCardImpl("Good-natured, fun-loving Aussie racism.", CardType.WHITE));
        cards.add(new JCardImpl("Half a kilo of pure Chinese White heroin.", CardType.WHITE));
        cards.add(new JCardImpl("Having a Golden Gaytime.", CardType.WHITE));
        cards.add(new JCardImpl("Having a shag in the back of the ute.", CardType.WHITE));
        cards.add(new JCardImpl("Ice.", CardType.WHITE));
        cards.add(new JCardImpl("Inserting a jam jar into my anus.", CardType.WHITE));
        cards.add(new JCardImpl("Jehovah's witnesses.", CardType.WHITE));
        cards.add(new JCardImpl("John Howard's eyebrows.", CardType.WHITE));
        cards.add(new JCardImpl("Kids with bum cancer.", CardType.WHITE));
        cards.add(new JCardImpl("Liberals.", CardType.WHITE));
        cards.add(new JCardImpl("LYNX Body Spray", CardType.WHITE));
        cards.add(new JCardImpl("Making up for centuries of oppression with one day of apologising.", CardType.WHITE));
        cards.add(new JCardImpl("Massive, widespread drought.", CardType.WHITE));
        cards.add(new JCardImpl("Millions of cane toads.", CardType.WHITE));
        cards.add(new JCardImpl("Mr. Squiggle, the Man from the Moon.", CardType.WHITE));
        cards.add(new JCardImpl("Nippers.", CardType.WHITE));
        cards.add(new JCardImpl("Nothing but sand.", CardType.WHITE));
        cards.add(new JCardImpl("Oestrogen.", CardType.WHITE));
        cards.add(new JCardImpl("Paedophiles.", CardType.WHITE));
        cards.add(new JCardImpl("Perfunctory foreplay.", CardType.WHITE));
        cards.add(new JCardImpl("Playing silly buggers.", CardType.WHITE));
        cards.add(new JCardImpl("Profound respect and appreciation for indigenous culture.", CardType.WHITE));
        cards.add(new JCardImpl("Rupert Murdoch.", CardType.WHITE));
        cards.add(new JCardImpl("Queen Elizabeth's immaculate anus.", CardType.WHITE));
        cards.add(new JCardImpl("Scalping the Milkybar kid.", CardType.WHITE));
        cards.add(new JCardImpl("Skippy the Bush Kangaroo.", CardType.WHITE));
        cards.add(new JCardImpl("Some bloody peace and quiet.", CardType.WHITE));
        cards.add(new JCardImpl("Sorry, this content cannot be viewed in your region.", CardType.WHITE));
        cards.add(new JCardImpl("Steve Irwin.", CardType.WHITE));
        cards.add(new JCardImpl("Summoning Harold Holt from the sea in a time of great need.", CardType.WHITE));
        cards.add(new JCardImpl("Taking a sheep-wife.", CardType.WHITE));
        cards.add(new JCardImpl("The big fucking hole in the ozone layer.", CardType.WHITE));
        cards.add(new JCardImpl("The bush.", CardType.WHITE));
        cards.add(new JCardImpl("The cool refreshing taste of Coca-Cola.", CardType.WHITE));
        cards.add(new JCardImpl("The Great Emu War.", CardType.WHITE));
        cards.add(new JCardImpl("The White Australia Policy.", CardType.WHITE));
        cards.add(new JCardImpl("Tony Abbott in budgie smugglers.", CardType.WHITE));
        cards.add(new JCardImpl("Total control of the media.", CardType.WHITE));
        cards.add(new JCardImpl("Twenty tonnes of bat shit.", CardType.WHITE));
        cards.add(new JCardImpl("Vegemite.", CardType.WHITE));
        cards.add(new JCardImpl("Vomiting into a kangaroo's pouch.", CardType.WHITE));
        cards.add(new JCardImpl("Waking up half-naked in a Macca's car park.", CardType.WHITE));
        cards.add(new JCardImpl("Wanking into a pool of children's tears.", CardType.WHITE));
        cards.add(new JCardImpl("Whiskas Catmilk.", CardType.WHITE));
        cards.add(new JCardImpl("Wiping her bum.", CardType.WHITE));
        cards.add(new JCardImpl("Women's undies.", CardType.WHITE));
        cards.add(new JCardImpl("Xenophobia.", CardType.WHITE));

        cards.add(new JBlackCard("ABC presents \"_: The Story of _\"", CardType.BLACK, 2));
        cards.add(new JBlackCard("Are you thinking what I'm thinking B1? I think I am, B2: it's _ time!", CardType.BLACK, 1));
        cards.add(new JBlackCard("As my New Year's resolution, I vow to give up _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Channel 9 is pleased to present its new variety show, \"hey Hey It's _.\"", CardType.BLACK, 1));
        cards.add(new JBlackCard("Crikey! I've never seen _ like this before! Let's get a bit closer.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Daddy, why is mummy crying?", CardType.BLACK, 1));
        cards.add(new JBlackCard("I'm sorry, Sir, but I couldn't complete my homework because of _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("In an attempt to reach a wider audience, the National Museium of Australia has opened an interactive exhibit on _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("In Australia, _ is twice as big and twice as deadly.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Life for Aboriginal people was forever changed when the white man introduced them to _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Next on Nine's Wide World of Sports: The World Championship of _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Oi! Show us _!", CardType.BLACK, 1));
        cards.add(new JBlackCard("Qantas now prohibits _ on airplanes.", CardType.BLACK, 1));
        cards.add(new JBlackCard("The school excursion was completely ruined by _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("Today on Jerry Springer: \"Help! My son is _!\"", CardType.BLACK, 1));
        cards.add(new JBlackCard("What broke up the original Wiggles?", CardType.BLACK, 1));
        cards.add(new JBlackCard("What did I bring back from Bali?", CardType.BLACK, 1));
        cards.add(new JBlackCard("What don't you want to find in your Mongolian beef?", CardType.BLACK, 1));
        cards.add(new JBlackCard("When I am a billionaire, I shall erect a 20-metre statue to commemorate _.", CardType.BLACK, 1));
        cards.add(new JBlackCard("When I am prime minister, I will create the Ministry of _.", CardType.BLACK, 1));

        cardPacks.add(new JCardPackImpl("Base Game - Australia", "The Australian version of the base game.", "Cards Against Humanity", cards));

        cards.clear();
        /*
         *Printing all card information to the console for debugging
         */
        for (JCardPackImpl p : cardPacks) {
            System.out.println(p.getName() + ";\n");
            StringBuilder sb = new StringBuilder();
            for (JCardImpl c : p.getCards()) {
                if (c.getCardType().equals(CardType.WHITE)) {
                    sb.append(c.getText());
                } else {
                    System.out.println((c.getText() + ": " + ((JBlackCard) c).getChoiceCount()));
                }
            }
            System.out.println("\n" + p.getDescription() + "\n");
        }
    }

    /**
     * Allows a new cardpack to be added
     *
     * @param cardPacks List - The cardpack to be added
     */
    public static void addCardPacks(List<JCardPackImpl> cardPacks) {
        for (JCardPackImpl j : cardPacks) {
            cardPacks.add(j);
        }
    }

    /**
     * Returns the full list of cardpacks available (default and custom)
     *
     * @return List - The cardpacks available for usage
     */
    public static List<JCardPackImpl> getCardPacks() {

        return cardPacks;
    }

    /**
     * Returns the full list of perks available
     *
     * @return List - The perks available for usage
     */
    public static List<JPerk> getPerks() {
        return perks;
    }

    /**
     * Returns the full list of flags available
     *
     * @return List - The flags available for usage
     */
    public static List<JFlag> getFlags() {
        return flags;
    }
}
