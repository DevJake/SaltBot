package me.Salt.Handlers.Games.CardsAgainstDiscord.Util;

import java.util.HashMap;

/**
 * Created by 15122390 on 05/12/2016.
 */
public class Flag {

    public Flag(String name, String description, HashMap<Flag, Boolean> stackables) {
        this.name = name;
        this.description = description;
        this.stackables = stackables;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<Flag, Boolean> getStackables() {
        return stackables;
    }

    private String name;
    private String description;
    private HashMap<Flag, Boolean> stackables;
}
