package me.Salt.Entities;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public interface JCore {

    List<JUser> getJUsersByName(String name);

    JUser getJUserById(String ID);
}
