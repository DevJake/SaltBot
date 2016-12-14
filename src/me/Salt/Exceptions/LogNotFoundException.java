package me.Salt.Exceptions;

/**
 * Created by Salt001 on 19/11/2016.
 *
 */
public class LogNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "No logfiles could be found";
    }
}
