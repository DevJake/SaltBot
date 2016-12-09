package me.Salt.JPI.Entities;

import net.dv8tion.jda.entities.User;

/**
 * Created by Salt001 on 19/11/2016.
 */
public interface JUser {
    JPermissionManager getPermissionManager();

    User getUser();
}
