package me.Salt.Entities.Impl;

import me.Salt.Entities.JGuild;
import me.Salt.Entities.JPermissionManager;
import me.Salt.Entities.JUser;
import me.Salt.Util.Permission;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JPermissionManagerImpl implements JPermissionManager {

    @Override
    public void addPermission(JUser jUser, JGuild jGuild) {

    }

    @Override
    public List<Permission> getPermissions(JUser jUser) {
        return null;
    }

    @Override
    public List<Permission> getPermissions(JUser jUser, JGuild jGuild) {
        return null;
    }

    @Override
    public boolean hasPermission(Permission permission, JUser jUser, JGuild jGuild) {
        return false;
    }

    @Override
    public void removePermission(JUser jUser, JGuild jGuild) {

    }
}
