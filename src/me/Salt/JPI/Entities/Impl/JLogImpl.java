package me.Salt.JPI.Entities.Impl;

import me.Salt.JPI.Entities.JLog;
import me.Salt.JPI.Entities.JLogEntry;

import java.util.Date;

/**
 * Created by Salt001 on 19/11/2016.
 */
public class JLogImpl implements JLog {

    private class JLogEntryImpl implements JLogEntry {

        private JLogEntryImpl() {

        }

        @Override
        public int getKey() {
            return 0;
        }

        @Override
        public Date getDate() {
            return null;
        }

        //TODO: all log entries should have a number appended (or prepended). This number denotes what -type- of entry it is, ie what event. This can then be read to determine what methods to provide
    }
}


