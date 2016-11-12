package me.Salt.Handlers.Commands;

public class SuccDisTerm {

//Class probably unnecessary. Takes data and determines if it should be handled in successive or disjunctive mode. --succ tag overrides the outcome. Class unneeded as algorithm is simple. if all parameters have the same number of elements, function 
successively, else, disjunctive mode. Algorithm can be performed in the command header itself, either raw or by a method. Maybe create a util class for simple yet repeatable methods like this. 

private HashMap<String, boolean> disHash = new ArrayList<>();

//String is command;param, boolean is if the param is required. if cmd not listed, assume cmd is Successive and optional. 

disHash.add("mute;u", true);
disHash.add("mute;d", false);
public boolean isDisjunctive(String command, String paramHeader){

}
}