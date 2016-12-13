package me.Salt.Commands;

import me.Salt.Handlers.Main;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class HelpCommand implements Command {
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        StringBuilder sb = new StringBuilder();
        sb.append("Command prefix: \"" + Main.cmdPrefix + "\"\n```");
        for (String key : Main.commands.keySet()) {
            sb.append("\n" + key);
        }

        sb.append("```");

        cmd.getEvent().getTextChannel().sendMessageAsync(sb.toString(), null);
    }

    @Override
    public void postExecution(boolean success) {

    }

    @Override
    public String help() {
        return null;
    }
}
