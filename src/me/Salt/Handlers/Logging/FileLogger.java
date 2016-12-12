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

    public FileLogger() {
        eventList.put("MessageReceivedEvent", "[Time] (UserID)" + Spacer("[Username]:", 49));
    }

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

    public void write(String eventName, String message, Guild guild, User user) {
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

    private void setHeader() {
        out.println("[Creation time and date: " + now.toString() + "]");
        out.println(header);
    }

    public void autoFlush(boolean autoFlush) {
        this.autoFlush = autoFlush;
    }

    public void flush() {
        out.flush();
    }

    public boolean getLogToConsole() {
        return this.consoleLog;
    }

    public void setLogToConsole(boolean LogToConsole) {
        this.consoleLog = LogToConsole;
    }
}
