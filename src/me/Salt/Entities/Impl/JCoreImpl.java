package me.Salt.Entities.Impl;

import me.Salt.Entities.JCore;
import me.Salt.Entities.JUser;
import me.Salt.Handlers.Main;
import net.dv8tion.jda.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JCoreImpl implements JCore {

    @Override
    public List<JUser> getJUsersByName(String name) {
        List<JUser> jUsers = new ArrayList<>();
        for (User u : Main.jda.getUsersByName(name)) {
            jUsers.add(new JUserImpl(u));
        }
        return jUsers;
    }

    @Override
    public JUser getJUserById(String ID) {
        return new JUserImpl(Main.jda.getUserById(ID));
    }
}