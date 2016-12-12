package me.Salt.Util;

import me.Salt.Listeners.EventListener;
import net.dv8tion.jda.events.Event;

/**
 * Created by Salt001 on 14/11/2016.
 */
public interface CommandHandler {

    void register(EventListener eventListener); //Register to the EventListener as a desired recipient of events
    void receive(Event event); //Handle incomming data
    void unregister(EventListener eventListener);
}
