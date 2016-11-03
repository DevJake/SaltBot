package me.Salt.Handlers.Logging;

import net.dv8tion.jda.entities.Message;
import net.dv8tion.jda.events.Event;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.List;


/**
 * Created by zuezy on 01/11/2016.
 */
public class LoggerEventDistributor {
    private FileLogger fl = new FileLogger();


    public LoggerEventDistributor(Event event) {
        if (event instanceof MessageReceivedEvent) {
            this.MessageReceivedEvent((MessageReceivedEvent) event);
        }
    }

    private void MessageReceivedEvent(MessageReceivedEvent event) {

        List<Message.Attachment> attachments = event.getMessage().getAttachments();

        StringBuilder sb = new StringBuilder();
        if (attachments.size() > 0) {
            sb.append("             Attachment: ");
            for (int i = 0; i < attachments.size(); i++) {
                sb.append("\"" + attachments.get(i).getFileName() + "\": " + attachments.get(i).getUrl());
            }
        }

        fl.write(event.getClass().getSimpleName(),
                "(" + event.getAuthor().getId() + ")"
                        + fl.Spacer(event.getAuthorNick())
                        + ": " + event.getMessage().getContent() + sb.toString(), event.getGuild(), event.getAuthor());
    }
}
