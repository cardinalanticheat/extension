package me.clientastisch.events.event.impl.player.others;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketTapCompleteEvent implements Event<PacketTapCompleteEvent> {

    public abstract String getMessage();

}
