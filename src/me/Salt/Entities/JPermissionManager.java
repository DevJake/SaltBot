package me.Salt.Entities;

import me.Salt.Util.Permission;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public interface JPermissionManager {
    boolean hasPermission(Permission permission);

    void addPermission();

    List<Permission> getPermissions(JUser jUser);

}
