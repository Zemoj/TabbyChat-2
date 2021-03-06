package mnm.mods.tabbychat.api;

import java.util.Date;

import net.minecraft.util.IChatComponent;

/**
 * Represents a message.
 */
public interface Message {

    /**
     * Gets the message
     *
     * @return The message
     */
    IChatComponent getMessage();

    /**
     * Gets the message with a time stamp if they are enabled.
     *
     * @return The time-stamped message
     */
    IChatComponent getMessageWithOptionalTimestamp();

    /**
     * Gets the update counter used for this message.
     *
     * @return The counter
     */
    int getCounter();

    /**
     * Gets the ID of this message. 0 is a normal message.
     *
     * @return The ID of this message
     */
    int getID();

    /**
     * Gets the date that this message was sent.
     *
     * @return The date
     */
    Date getDate();


}
