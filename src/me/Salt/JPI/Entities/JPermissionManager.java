package me.Salt.JPI.Entities;

import me.Salt.Util.Permission;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public interface JPermissionManager {

    void addPermission(JUser jUser, JGuild jGuild, Permission permission);

    void addPermission(JUser jUser, Permission permission);

    void addPermission(JGuild jGuild, Permission permission);

    void addPermission(JUser jUser, JGuild jGuild, List<Permission> permission);

    void addPermission(JUser jUser, List<Permission> permission);

    void addPermission(JGuild jGuild, List<Permission> permission);

    List<Permission> getPermissions(JUser jUser);

    List<Permission> getPermissions(JUser jUser, JGuild jGuild);

    boolean hasPermission(Permission permission, JUser jUser, JGuild jGuild);

    void removePermission(JUser jUser, JGuild jGuild);


}
