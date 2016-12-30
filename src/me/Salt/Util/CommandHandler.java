package me.Salt.Util;

import me.Salt.Listeners.EventListener;
import net.dv8tion.jda.events.Event;

/**
 * Created by Salt001 on 14/11/2016.
 */
public interface CommandHandler {
    /**
     * Register the class to an EventListener as a desired recipient of events.
     *
     * @param eventListener EventListener - The EventListener to register to.
     */
    void register(EventListener eventListener);

    /**
     * Receive the Event instance
     *
     * @param event Event - The Event calling this method
     */
    void receive(Event event); //Handle incoming data

    /**
     * Unregister the class to an EventListener as a desired recipient of events.
     *
     * @param eventListener EventListener - The EventListener to register to.
     */
    void unregister(EventListener eventListener);
}
