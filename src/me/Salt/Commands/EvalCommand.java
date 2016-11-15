package me.Salt.Commands;

import bsh.EvalError;
import bsh.Interpreter;
import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;
import me.Salt.Util.Command;

/**
 * Created by Salt001 on 15/11/2016.
 */
public class EvalCommand implements Command {
    @Override
    public boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener) {
        return true;
    }

    @Override
    public void execution(CommandParser.CommandContainer cmd) {
        Interpreter interpreter = new Interpreter();
        StringBuilder sb = new StringBuilder();

        for (String arg : cmd.getArgsUpper()) {
            sb.append(" " + arg);
        }
        try {
            interpreter.set("cmd", cmd);
            interpreter.eval(sb.toString());
        } catch (EvalError evalError) {
            cmd.getEvent().getTextChannel().sendMessageAsync("```\n" + evalError.getMessage() + "\n```", null);
        }
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
