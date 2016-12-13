package me.Salt.Handlers.Logging;


import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.entities.User;

import java.io.*;
import java.lang.reflect.MalformedParametersException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by zuezy on 31/10/2016.
 */
public class FileLogger {
    private Date now = new Date();
    private SimpleDateFormat dom = new SimpleDateFormat("dd.MM.yyyy");
    private SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
    private File dir;
    private PrintStream out;
    private Boolean autoFlush = true;
    private String eventName;
    private Boolean consoleLog = true;
    private String header;
    private HashMap<String, String> eventList = new HashMap<>();

    /**
     * A constructor that initialises a HashMap
     */
    public FileLogger() {
        eventList.put("MessageReceivedEvent", "[Time] (UserID)" + Spacer("[Username]:", 49));
    }

    /**
     * When given a string; automatically prepends whitespace characters up to a final limit of 32 total characters.
     *
     * @param message String - The message to add whitespace characters to.
     * @return String - message, 'spaced'.
     */
    public String Spacer(String message) {
        StringBuilder sb = new StringBuilder();
        if (message.length() % 32 > 0) {
            for (int i = message.length() % 32; i <= 32; i++) {
                sb.append(" ");
            }
        }
        sb.append(message);

        return sb.toString();
    }

    /**
     * When given a string; automatically prepends whitespace characters, in accordance to the value of limit.
     *
     * @param message String - The message to add whitespace characters to.
     * @param limit   Integer - How many total characters to finish at.
     * @return String message; 'spaced'.
     */
    public String Spacer(String message, int limit) {
        StringBuilder sb = new StringBuilder();
        if (message.length() % limit > 0) {
            for (int i = message.length() % limit; i <= limit; i++) {
                sb.append(" ");
            }
        }
        sb.append(message);

        return sb.toString();
    }

    /**
     * Writes an entry to the log, in accordance with the entered data. The data written is dependent on what event
     * called upon the #write() method, the message to write, and the guild & the user that the data originated from.
     *
     * @param eventName String - The name of the event calling the method
     * @param message   - String - The message to write to the log
     * @param guild     Guild - The originating guild
     * @param user      User - The user that performed the action that caused the log-write event
     */
    public void write(String eventName, String message, Guild guild, User user) { //TODO: Redo...
        this.header = eventList.getOrDefault(eventName, null);

        if (this.header == null) {
            throw new MalformedParametersException("The specified eventName could not be found or isn't listed");
        }

        this.eventName = eventName.substring(0, eventName.length() - 5).concat("Log");
        dir = new File("Data/Logger/"
                + guild.getName()
                + " (" + guild.getId()
                + ")/" + dom.format(now) + "/"
                + user.getUsername() + " ("
                + user.getId() + ")/"
                + "Log.txt");

        try {
            boolean shouldAddHeader = false;
            if (!(dir.exists())) {
                dir.getParentFile().mkdirs();
                dir.createNewFile();
                System.out.println("Created directory: " + dir.getAbsolutePath());
                shouldAddHeader = true;
            }

            out = new PrintStream(new BufferedOutputStream(new FileOutputStream(dir.getAbsoluteFile(), true)));

            if (shouldAddHeader) setHeader();

            out.println("[" + time.format(now) + "] " + message);

            if (autoFlush) out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (consoleLog) System.out.println("[" + dom.format(now) + " " + time.format(now) + "] " + message);
    }

    /**
     * Sets the header of the logfile to the current date and time, then the header.
     */
    private void setHeader() {
        out.println("[Creation time and date: " + now.toString() + "]");
        out.println(header);
    }

    /**
     * A setter method, controlling if the logger should automatically flush data to the logfile.
     *
     * @param autoFlush Boolean - Automatically flush data to the logfile
     */
    public void autoFlush(boolean autoFlush) {
        this.autoFlush = autoFlush;
    }

    /**
     * Causes data in the logger to be flushed to the logfile
     */
    public void flush() {
        out.flush();
    }

    /**
     * Returns a Boolean, determining if the logger writes all log entries to the console, as well.
     *
     * @return Boolean - Should write log entries to the console
     */
    public boolean getLogToConsole() {
        return this.consoleLog;
    }

    /**
     * A setter method, controlling if the logger should also write log entries to the console.
     *
     * @param LogToConsole Boolean - Should write all new log entries to the console as well
     */
    public void setLogToConsole(boolean LogToConsole) {
        this.consoleLog = LogToConsole;
    }
}
