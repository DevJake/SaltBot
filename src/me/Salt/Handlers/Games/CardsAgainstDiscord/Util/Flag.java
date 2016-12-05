package me.Salt.Handlers.Games.CardsAgainstDiscord.Util;

import java.util.HashMap;

/**
 * Created by 15122390 on 05/12/2016.
 */
public class Flag {

    private Flags flag;
    private String description;
    private HashMap<Flags, Boolean> stackables;
    private String field; //Such as "--inverse"
    private String name; //Such as "Inverse Mode"

    public Flag(Flags flag) {
        this.flag = flag;

        switch (flag) {
            case INVERSE:
                this.name = "Inverse Mode";
                this.field = "--inverse";
                this.description = "Inverts the gameplay, so that players must select black cards to fit a given white card";
                this.stackables = getHash(new Flags[]{}, new Boolean[]{});
            case SHOW_PACK:
            default:
        }
    }

    private HashMap<Flags, Boolean> getHash(Flags[] flags, Boolean[] val){
        HashMap<Flags, Boolean> hash = new HashMap<>();
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

    public Flags getFlag() {
        return flag;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<Flags, Boolean> getStackables() {
        return stackables;
    }

    public String getField() {
        return field;
    }
}
