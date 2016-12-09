package me.Salt.JPI.Entities.Games.CardsAgainstDiscord.Exceptions;

/**
 * Created by Salt001 on 06/12/2016.
 */
public class CaDException extends Exception {

    private String message;

    public CaDException() {

    }

    public CaDException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
