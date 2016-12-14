package me.Salt.Container;

import java.util.HashMap;

/**
 * Created by Salt001 on 15/11/2016.
 * A custom Datatype for the storing of information relating to a command.
 */

public class CommandDescription {
    private final HashMap<String, Boolean> nullMap = new HashMap<>();
    String description;
    String author;
    boolean isFinished;
    boolean supportsPermissions;
    private HashMap<String, Boolean> parameters;
    private HashMap<String, Boolean> definers;

    /**
     * A constructor, that stores data to private variables.
     *
     * @param parameters          HashMap - The parameters of the command
     * @param definers            HashMap - The definers of the command
     * @param CommandDescription  String - A description of the command
     * @param author              String - The author of the command
     * @param isFinished          Boolean - If the command is complete and ready to use
     * @param supportsPermissions Boolean - If the command supports permissions
     */
    public CommandDescription(HashMap<String, Boolean> parameters, HashMap<String, Boolean> definers, String CommandDescription, String author, boolean isFinished, boolean supportsPermissions) {
        nullMap.put("", false);
        this.parameters = parameters == null ? nullMap : parameters;
        this.definers = definers == null ? nullMap : definers;
        this.description = CommandDescription;
        this.author = author;
        this.isFinished = isFinished;
        this.supportsPermissions = supportsPermissions;
    }

    /**
     * @return HashMap - The parameters of the command
     */
    public HashMap<String, Boolean> getParameters() {
        return parameters;
    }

    /**
     * @return HashMap - The definers of the command
     */
    public HashMap<String, Boolean> getDefiners() {
        return definers;
    }

    /**
     * @return String - A description of the command
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return String - The author of the command
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return Boolean - If the command is complete and ready to use
     */
    public boolean isFinished() {
        return isFinished;
    }

    /**
     * @return Boolean - If the command supports permissions
     */
    public boolean isSupportsPermissions() {
        return supportsPermissions;
    }

}
