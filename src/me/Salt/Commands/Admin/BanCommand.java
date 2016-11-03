package me.Salt.Commands.Admin;

import me.Salt.Parser.BanCommandParser;
import me.Salt.Parser.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by zuezy on 03/11/2016.
 */
public class BanCommand implements Command {

    private BanCommandParser.BanCommandContainer bc;

    @Override
    public boolean called(CommandParser.CommandContainer cmd) {
        bc = new BanCommandParser().parse(cmd);
        return false;
    }

    @Override
    public void action(CommandParser.CommandContainer cmd) {

    }

    @Override
    public void executed(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
