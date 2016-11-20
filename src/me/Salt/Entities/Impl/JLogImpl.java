package me.Salt.Entities.Impl;

import me.Salt.Entities.JLog;
import me.Salt.Entities.JLogEntry;
import me.Salt.Util.JLogComponent;

import java.util.List;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JLogImpl implements JLog {

    public JLogImpl(JLogType jLogType){

    }

    @Override
    public List<JLogComponent> getComponents() {
        return null;
    }

    private class JLogEntryImpl implements JLogEntry {

        private JLogEntryImpl(){

        }

        //TODO: all log entries should have a number appended (or prepended). This number denotes what -type- of entry it is, ie what event. This can then be read to determine what methods to provide
    }
}


