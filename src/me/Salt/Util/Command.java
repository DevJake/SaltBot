package me.Salt.Util;

import me.Salt.Listeners.EventListener;
import me.Salt.Parser.Command.CommandParser;

/**
 * Created by zuezy on 06/08/2016.
 */
public interface Command {
    /**
     * Runs the first method in a command's operation. preExecution should be used to analyse data required
     * for the main operation of the command. If any data isn't correct, or present, for the main operation to run,
     * the main operation can be cancelled by returning false.
     * If true is returned, the main operation will continue to be run.
     *
     * @param cmd           CommandParser.CommandContainer - The command entered by the user, parsed to a CommandContainer.
     * @param eventListener EventListener - The EventListener that called upon the preExecution method of this class.
     * @return Boolean - If the main operation should be run.
     */
    boolean preExecution(CommandParser.CommandContainer cmd, EventListener eventListener);

    /**
     * The main code of the command should be placed here. If preExecution returned true, this method shall be called upon.
     *
     * @param cmd CommandParser.CommandContainer - The command entered by the user, parsed to a CommandContainer.
     */
    void execution(CommandParser.CommandContainer cmd);

    /**
     * Runs regardless of the result of preExecution. Should be used as a 'cleanup' method, where code to properly terminate
     * the command's operation should be placed.
     *
     * @param success Boolean - The return-value of the preExecution method
     */
    void postExecution(boolean success);

    /**Called upon to provide a string, containing usage information about a command.
     * @return String - How to use the command
     */
    String help();
}
