package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JFlag;

import java.util.HashMap;

/**
 * Created by Salt001 on 07/12/2016.
 */
public class JFlagImpl implements JFlag {
    String name;
    String keyword;
    String description;
    HashMap<JFlag, Boolean> stackables;
    Flag flag;

    /**
     * A constructor for a flag. All flags actions are hardcoded.
     *
     * @param name        String - The name of the flag
     * @param keyword     String - The keyword of the flag
     * @param description String - A description of the flag
     * @param stackables  - HashMap - What other flags this flag can and cannot stack with
     * @param flag        Flag - The enumerated flag that this object represents
     */
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
