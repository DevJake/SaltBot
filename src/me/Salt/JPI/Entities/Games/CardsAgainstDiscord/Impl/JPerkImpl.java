package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JPerk;
import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Perk;

import java.util.HashMap;

/**
 * Created by 15122390 on 07/12/2016.
 */
public class JPerkImpl implements JPerk {
    String name;
    String description;
    Perk perk;
    HashMap<Perk, Boolean> stackables;

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
