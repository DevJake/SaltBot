package me.Salt.Entities;

import me.Salt.Entities.Impl.JCoreImpl;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JCoreBuilder {

    public JCoreBuilder(){
    }

    public JCore getJCore(){
        return new JCoreImpl();
    }
}
