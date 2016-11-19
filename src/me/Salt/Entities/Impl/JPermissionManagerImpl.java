package me.Salt.Entities.Impl;

import me.Salt.Entities.JPermissionManager;
import me.Salt.Util.Permission;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JPermissionManagerImpl implements JPermissionManager {
    @Override
    public boolean hasPermission(Permission permission) {
        return false;
    }
}
