package me.clientastisch.events.event.impl.player.actions;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketSneakEvent implements Event<PacketSneakEvent> {

    public abstract boolean isSneaking();

}
