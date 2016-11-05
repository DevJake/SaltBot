package me.Salt.Parser.Commands;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.ArrayList;

/**
 * Created by zuezy on 06/08/2016.
 */
public class CommandParser {

    public CommandContainer parse(String raw, MessageReceivedEvent event, String cmdPrefix) {
        ArrayList<String> split = new ArrayList<String>();
        String beheaded = raw.replaceFirst(cmdPrefix, "");
        String[] splitBeheaded = beheaded.split(" ");
        for (String s : splitBeheaded) {
            split.add(s);
        }

        String cmd = split.get(0);
        String[] argsUpper = new String[split.size() - 1];
        split.subList(1, split.size()).toArray(argsUpper);
        String[] args = argsUpper.clone();
        for (int i = 0; i < argsUpper.length; i++) {
            args[i] = argsUpper[i].toLowerCase();
        }

        return new CommandContainer(raw, cmd, beheaded, splitBeheaded, args, argsUpper, event);
    }

    public class CommandContainer {
        private String raw;
        private MessageReceivedEvent event;
        private String[] args;
        private String beheaded;
        private String[] splitBeheaded;
        private String cmd;
        private String[] argsUpper;

        public CommandContainer(String raw, String cmd, String beheaded, String splitBeheaded[], String[] args, String[] argsUpper, MessageReceivedEvent event) {
            this.raw = raw;
            this.cmd = cmd;
            this.beheaded = beheaded;
            this.splitBeheaded = splitBeheaded;
            this.args = args;
            this.argsUpper = argsUpper;
            this.event = event;
        }

        public String[] getArgsUpper() {
            return argsUpper;
        }

        public String[] getSplitBeheaded() {
            return splitBeheaded;
        }

        public String getRaw() {
            return raw;
        }

        public MessageReceivedEvent getEvent() {
            return event;
        }

        public String[] getArgs() {
            return args;
        }

        public String getBeheaded() {
            return beheaded;
        }

        public String getCmd() {
            return cmd;
        }
    }
}
