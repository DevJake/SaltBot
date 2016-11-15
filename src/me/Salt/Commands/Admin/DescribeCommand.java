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
    private static HashMap<String, HashMap<String, String>> paramDescs = new HashMap<>();

    private static HashMap<HashMap<String, String>, Boolean> cmdParamMap = new HashMap<>(); //First string is the prefix used, second string is the name and description, boolean is if the parameter is required
    private static HashMap<String, Boolean> cmdDefinerMap = new HashMap<>();

    private static Map<String, >

    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    private HashMap<String, String> temp1(String prefix, String name, String description){
        HashMap<String, String> temp1 = new HashMap<>();
        temp1.put(prefix, name + ":" + description);
        return temp1;
    }
    @Override
    public void execution(CommandParser.CommandContainer cmd) {

        cmdParamMap.put(temp1("u:", "UID", "Specifies the username or ID of a user"), true);
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
