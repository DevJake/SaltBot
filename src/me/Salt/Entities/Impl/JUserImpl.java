package me.Salt.Entities.Impl;

import me.Salt.Entities.JPermissionManager;
import me.Salt.Entities.JUser;
import net.dv8tion.jda.entities.User;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JUserImpl implements JUser {
    private User user;

    public JUserImpl(User user) {
        this.user = user;
    }

    @Override
    public JPermissionManager getPermissionManager() {
        return null;
    }

    @Override
    public User getUser() {
        return user;
    }
}
