package me.Salt.Commands.Admin;

import me.Salt.Container.CommandDescription;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Salt001 on 15/11/2016.
 * Manages the description of a command.
 */
public class DescribeCommand implements Command {
    private static HashMap<String, CommandDescription> cmdDescs = new HashMap<String, CommandDescription>(); //Stores the command, followed by a CommandDescription
    private static HashMap<String, List<String>> cmdAlias = new HashMap<String, List<String>>();
    
    /*
    Stores the command, followed by a List<String> of the aliases. 
    If cmdDescs doesn't contain the inputted command, cmdAlias can also be checked.
    If cmdAlias contains the input, the corresponding key is found, 
    else, the input was an invalid input. 
    
    //TODO: The value to find in cmdAlias is used as the 'key'. 
    May be problematic, but swapping the values is difficult. 
    May be easier to use a <String, String> HashMap, and store
    each alias as <Alias, Command>. Will create a potentially larger
    HashMap, but will resolve any issues. 
    */

    /**
     * Creates a series of Maps and HashMaps, used for the storage of information about command's and their parameters.
     * Also stores information on if the parameter is required.
     * @param data String[] - The command
     * @param name String[] - The name of the parameter
     * @param description String[] - A description of the parameter
     * @param required String[] - If the parameter is required
     * @return
     */
    private HashMap<String, Boolean> createMap(String[] data, String[] name, String[] description, Boolean[] required) {
        //TODO: MUST redo. Use a custom datatype inheriting an interface instead.
        // Use interface to allow for set methods to be used, with varying data returned.
        if (data.length + name.length + description.length + required.length == data.length * 4) {
            HashMap<String, Boolean> temp1 = new HashMap<String, Boolean>();
            for (int i = 0; i < data.length; i++) {
                temp1.put(data[i] + ":" + name[i] + ":" + description[i], required[i]);
            }
            return temp1;
        }
        return null;
    }

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) { //TODO: Redo and improve

        cmdDescs.put("mute", new CommandDescription(
                createMap(
                        new String[]{"u", "d", "r", "vc"},
                        new String[]{"UiD", "Duration", "Reason", "VoiceChannel"},
                        new String[]{"Part of a username or a full UserID", "A timescale in the data format", "A reason for the mute", "Part of a VoiceChannel name or a full VoiceChannelID to apply the mute in"},
                        new Boolean[]{true, false, false, false}),
                null,
                "Allows for the server muting of a user or users, by name, part name, or ID",
                "Salt001",
                false,
                false));

        cmdDescs.put("deafen", new CommandDescription(
                null,
                null,
                "Allows for the server deafening of a user or users, by name, part name, or ID",
                "Salt001",
                false,
                false));

        cmdDescs.put("stats", new CommandDescription(
                null, //Change
                null, //Change
                "Returns a selection of statistics for SaltBot",
                "Salt001",
                false,
                false));

        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {


    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
