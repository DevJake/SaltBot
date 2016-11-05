package me.Salt.Parser.Admin.System;

import me.Salt.Parser.CommandParser;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class SystemConfigParser {
    /*
    Don't allow general users to edit. Only bot developers can edit the basic functions
     */
    public SystemConfigContainer parse(CommandParser.CommandContainer cmd){

        return new SystemConfigContainer();
    }
}
