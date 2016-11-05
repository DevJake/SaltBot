package me.Salt.Parser.Commands.Admin;

/**
 * Created by Salt001 on 05/11/2016.
 */
public class PrivateVoiceChannelParser {
    /**
     * Allows user with the permissions to block other users entering their channel
     * List of blocked users can also be configured
     *
     * By default, all users are blocked. Whitelisted users are saved in file unique to user.
     *
     */
    public PrivateVoiceChannelContainer parse(){

        return new PrivateVoiceChannelContainer();
    }
}
