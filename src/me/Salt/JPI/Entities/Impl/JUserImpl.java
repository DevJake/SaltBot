package me.Salt.JPI.Entities.Impl;

import me.Salt.JPI.Entities.Games.CardsAgainstDiscord.JPerk;
import me.Salt.JPI.Entities.JPermissionManager;
import me.Salt.JPI.Entities.JUser;
import net.dv8tion.jda.entities.User;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JUserImpl implements JUser {
    private User user;
    private List<JPerk> perks;

    public JUserImpl(User user) {
        this.user = user;
    }

    public JUserImpl(User user, List<JPerk> perks) {
        this.user = user;
        this.perks = perks;
    }

    public List<JPerk> getPerks() {
        return perks;
    }

    public void setPerks(List<JPerk> perks) {
        this.perks = perks;
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
