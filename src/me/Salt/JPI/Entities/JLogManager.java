package me.Salt.JPI.Entities;

import me.Salt.Exceptions.LogNotFoundException;
import me.Salt.Util.JLogComponent;

import java.util.Date;
import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public interface JLogManager {
    List<JLog> getLogs(JUser jUser) throws LogNotFoundException;

    List<JLog> getLogs(JUser jUser, JGuild jGuild) throws LogNotFoundException;

    List<JLog> getLogs(JGuild jGuild) throws LogNotFoundException;

    List<JLog> getLogs(JUser jUser, Date beginDate) throws LogNotFoundException;

    List<JLog> getLogs(JUser jUser, Date beginDate, Date endDate) throws LogNotFoundException;

    List<JLog> getLogs(JUser jUser, JGuild jGuild, Date beginDate, Date endDate) throws LogNotFoundException;

    List<JLog> getLogs(JGuild jGuild, Date beginDate, Date endDate) throws LogNotFoundException;

    List<JLog> getLogs(JGuild jGuild, Date beginDate) throws LogNotFoundException;

    List<JLogComponent> getLoggedEvents(JUser jUser);

    List<JLogComponent> getLoggedEvents(JGuild jGuild);

    boolean isLogged(JUser jUser);

    boolean isLogged(JGuild jGuild);
}
