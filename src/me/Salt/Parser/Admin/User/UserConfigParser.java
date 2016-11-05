package me.Salt.Parser.Admin.User;

import me.Salt.Parser.CommandParser;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class UserConfigParser {
    /*
    Only allow people with bot-local permissions to use
     */

    public UserConfigContainer parse(CommandParser.CommandContainer cmd){

        return new UserConfigContainer();
    }
}
