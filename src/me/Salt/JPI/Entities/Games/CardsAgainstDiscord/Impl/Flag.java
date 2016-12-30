package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Util.Flags;

import java.util.HashMap;

/**
 * Created by Salt001 on 05/12/2016.
 */
public class Flag {

    private Flags flags;
    private String description;
    private HashMap<Flags, Boolean> stackables;
    private String field; //Such as "--inverse"
    private String name; //Such as "Inverse Mode"

    /**
     * A constructor for the Flag class
     *
     * @param flags Flags - The flag that this class should use for further operation
     */
    public Flag(Flags flags) {
        this.flags = flags;

        switch (flags) {
            case INVERSE:
                this.name = "Inverse Mode";
                this.field = "--inverse";
                this.description = "Inverts the gameplay, so that players must select black cards to fit a given white card";
                this.stackables = getHash(new Flags[]{}, new Boolean[]{});
            case SHOW_PACK:
            default:
        }
    }

    /**
     * Returns a HashMap from the inputted parameters.
     * <p>
     * The HashMap outlines if a specified flag is active in the current game instance or not.
     *
     * @param flags Flags[] - An array of flags to be used as the 'key' for the HashMap
     * @param val   Boolean[] - An array of flags to be used as the 'value' for the HashMap
     * @return null - The parameters specified weren't correct
     */
    private HashMap<Flags, Boolean> getHash(Flags[] flags, Boolean[] val) {
        HashMap<Flags, Boolean> hash = new HashMap<>();
        for (int i = 0; i < flags.length; i++) {
            if (val.length < i) {
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

    public Flags getFlags() {
        return flags;
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
