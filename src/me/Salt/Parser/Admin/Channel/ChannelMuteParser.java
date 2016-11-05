package me.Salt.Parser.Admin.Channel;

import me.Salt.Parser.CommandParser;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class ChannelMuteParser {
    /*
    Muted channels can be joined, but users cannot speak in them
     */
    public ChannelMuteContainer parse(CommandParser.CommandContainer cmd){

        return new ChannelMuteContainer();
    }
}
