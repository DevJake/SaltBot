package me.Salt.JPI.Entities.Impl;

import me.Salt.Exceptions.LogNotFoundException;
import me.Salt.JPI.Entities.JGuild;
import me.Salt.JPI.Entities.JLog;
import me.Salt.JPI.Entities.JLogManager;
import me.Salt.JPI.Entities.JUser;
import me.Salt.Util.JLogComponent;

import java.util.Date;
import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JLogManagerImpl implements JLogManager {
    @Override
    public List<JLog> getLogs(JUser jUser) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JUser jUser, JGuild jGuild) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JGuild jGuild) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JUser jUser, Date beginDate) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JUser jUser, Date beginDate, Date endDate) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JUser jUser, JGuild jGuild, Date beginDate, Date endDate) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JGuild jGuild, Date beginDate, Date endDate) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLog> getLogs(JGuild jGuild, Date beginDate) throws LogNotFoundException {
        return null;
    }

    @Override
    public List<JLogComponent> getLoggedEvents(JUser jUser) {
        return null;
    }

    @Override
    public List<JLogComponent> getLoggedEvents(JGuild jGuild) {
        return null;
    }

    @Override
    public boolean isLogged(JUser jUser) {
        return false;
    }

    @Override
    public boolean isLogged(JGuild jGuild) {
        return false;
    }
}
