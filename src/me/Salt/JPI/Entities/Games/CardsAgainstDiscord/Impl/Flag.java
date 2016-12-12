package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import java.util.HashMap;

/**
 * Created by 15122390 on 05/12/2016.
 */
public class Flag {

    private me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag flag;
    private String description;
    private HashMap<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag, Boolean> stackables;
    private String field; //Such as "--inverse"
    private String name; //Such as "Inverse Mode"

    public Flag(me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag flag) {
        this.flag = flag;

        switch (flag) {
            case INVERSE:
                this.name = "Inverse Mode";
                this.field = "--inverse";
                this.description = "Inverts the gameplay, so that players must select black cards to fit a given white card";
                this.stackables = getHash(new me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag[]{}, new Boolean[]{});
            case SHOW_PACK:
            default:
        }
    }

    private HashMap<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag, Boolean> getHash(me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag[] flags, Boolean[] val){
        HashMap<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag, Boolean> hash = new HashMap<>();
        for (int i = 0;i<flags.length;i++){
            if (val.length<i){
                hash.put(flags[i], val[i]);
            } else {
                hash.put(flags[i], false); //No matching value defaults to 'false'
            }
        }
        return null; //TODO: Convert to Exception
    }

    public String getName() {
        return name;
    }

    public me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag getFlag() {
        return flag;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flag, Boolean> getStackables() {
        return stackables;
    }

    public String getField() {
        return field;
    }
}
