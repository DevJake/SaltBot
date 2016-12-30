package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JPerk;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Perk;

import java.util.HashMap;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JPerkImpl implements JPerk {
    String name;
    String description;
    Perk perk;
    HashMap<Perk, Boolean> stackables;

    /**
     * A constructor for a perk. All perk actions are hardcoded.
     *
     * @param name        String - The name of the perk
     * @param description String - A description of the perk
     * @param perk        Perk - The enumerated perk that this class handles
     * @param stackables  HashMap - A HashMap of which perks this perk can and cannot stack with
     */
    public JPerkImpl(String name, String description, Perk perk, HashMap<Perk, Boolean> stackables) {
        this.name = name;
        this.description = description;
        this.perk = perk;
        this.stackables = stackables;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Perk getPerk() {
        return perk;
    }

    public HashMap<Perk, Boolean> getStackables() {
        return stackables;
    }
}
