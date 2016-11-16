package me.Salt.Commands.Admin;

import me.Salt.Container.CommandDescription;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class DescribeCommand implements Command {
    private static HashMap<String, CommandDescription> cmdDescs = new HashMap<>();

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    private HashMap<String, Boolean> createMap(String[] data, String[] name, String[] description, Boolean[] required){
        if (data.length+name.length+description.length+required.length==data.length*4) {
            HashMap<String, Boolean> temp1 = new HashMap<>();
            for (int i = 0;i<data.length;i++){
                temp1.put(data[i] + ":" + name[i] + ":" + description[i], required[i]);
            }
            return temp1;
        }
        return null;
    }
    @Override
    public void execution(CommandParser.CommandContainer cmd) {

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

        cmdDescs.put("deafen", new CommandDescription(
                null,
                null,
                "Allows for the server deafening of a user or users, by name, part name, or ID",
                "Salt001",
                false,
                false));
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public void setWaitResult(String input) {

    }

    @Override
    public String help() {
        return null;
    }
}
