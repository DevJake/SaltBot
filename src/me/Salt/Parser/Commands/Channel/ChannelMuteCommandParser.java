package me.Salt.Parser.Commands.Channel;

import me.Salt.Parser.Commands.CommandParser;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class ChannelMuteCommandParser {
    /*
    Muted channels can be joined, but users cannot speak in them
     */
    public ChannelMuteCommandContainer parse(CommandParser.CommandContainer cmd){

        return new ChannelMuteCommandContainer();
    }
}
