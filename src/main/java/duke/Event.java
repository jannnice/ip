package duke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * An Event is a task with a start and end date and time.
 */
public class Event extends Task {
    protected LocalDateTime from;
    protected LocalDateTime to;

    /**
     * Constructor method for Event.
     * @param description Description of the event.
     * @param from Start date and time of the event.
     * @param to End date and time of the event
     */
    public Event(String description, String from, String to) {
        super(description);
        this.from = LocalDateTime.parse(from);
        this.to = LocalDateTime.parse(to);
    }
    /**
     * Gets the full description of the event task.
     * The message here is used to be printed for the user.
     * @return Message for the description of the event task.
     */
    @Override
    public String printDesc() {
        String fromMessage = this.from.format(DateTimeFormatter.ofPattern("MMM d yyyy H:mm"));
        String toMessage = this.to.format(DateTimeFormatter.ofPattern("MMM d yyyy H:mm"));
        return "[E]" + super.printDesc() + " (from: " + fromMessage + " to: " + toMessage + ")";
    }
    /**
     * Gets the full description of the event task.
     * The message here is used to be stored in the duke.txt.
     * @return Message for the description of the event task.
     */
    @Override
    public String getDescription() {
        return "E~" + super.getDescription() + "~" + this.from + " - " + this.to;
    }
}
