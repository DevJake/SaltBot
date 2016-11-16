package me.Salt.Container;

import java.util.HashMap;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class CommandDescription {
    String description;
    String author;
    boolean isFinished;
    boolean supportsPermissions;
    private HashMap<String, Boolean> parameters;
    private HashMap<String, Boolean> definers;

    private final HashMap<String, Boolean> nullMap = new HashMap<>();

    public CommandDescription(HashMap<String, Boolean> parameters, HashMap<String, Boolean> definers, String CommandDescription, String author, boolean isFinished, boolean supportsPermissions) {
        nullMap.put("", false);
        this.parameters = parameters==null ? nullMap : parameters;
        this.definers = definers==null ? nullMap : definers;
        this.description = CommandDescription;
        this.author = author;
        this.isFinished = isFinished;
        this.supportsPermissions = supportsPermissions;
    }

    public HashMap<String, Boolean> getParameters() {
        return parameters;
    }

    public HashMap<String, Boolean> getDefiners() {
        return definers;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public boolean isSupportsPermissions() {
        return supportsPermissions;
    }

}
