package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions;

/**
 * Created by Salt001 on 06/12/2016.
 * An exception, unique to CardsAgainstDiscord.
 */
public class CaDException extends Exception {

    private String message;

    /**
     * A constructor for providing a message.
     *
     * @param message String - The message for the exception.
     */
    public CaDException(String message) {
        this.message = message;
    }

    /**
     * @return String - The custom message for the cause of the CaDException
     */
    @Override
    public String getMessage() {
        return message;
    }

}
