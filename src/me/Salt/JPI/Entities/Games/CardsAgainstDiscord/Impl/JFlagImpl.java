package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JFlag;

import java.util.HashMap;

/**
 * Created by 15122390 on 07/12/2016.
 */
public class JFlagImpl implements JFlag {
    String name;
    String keyword;
    String description;
    HashMap<JFlag, Boolean> stackables;
    Flag flag;

    public JFlagImpl(String name, String keyword, String description, HashMap<JFlag, Boolean> stackables, Flag flag) {
        this.name = name;
        this.keyword = keyword;
        this.description = description;
        this.stackables = stackables;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<JFlag, Boolean> getStackables() {
        return stackables;
    }

    public Flag getFlag() {
        return flag;
    }


}
