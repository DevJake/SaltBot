package me.Salt.JPI.Entities.Impl;

import me.Salt.JPI.Entities.JGuild;
import me.Salt.JPI.Entities.JPermissionManager;
import me.Salt.JPI.Entities.JUser;
import me.Salt.Util.Permission;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JPermissionManagerImpl implements JPermissionManager {

    @Override
    public void addPermission(JUser jUser, JGuild jGuild, Permission permission) {

    }

    @Override
    public void addPermission(JUser jUser, Permission permission) {

    }

    @Override
    public void addPermission(JGuild jGuild, Permission permission) {

    }

    @Override
    public void addPermission(JUser jUser, JGuild jGuild, List<Permission> permission) {

    }

    @Override
    public void addPermission(JUser jUser, List<Permission> permission) {

    }

    @Override
    public void addPermission(JGuild jGuild, List<Permission> permission) {

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
