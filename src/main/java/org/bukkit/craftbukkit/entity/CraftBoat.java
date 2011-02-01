package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityBoat;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Boat;

/**
 * A minecart.
 *
 * @author sk89q
 */
public class CraftBoat extends CraftVehicle implements Boat {
    protected EntityBoat boat;

    public CraftBoat(CraftServer server, EntityBoat entity) {
        super(server, entity);
        boat = entity;
    }

    @Override
    public String toString() {
        return "CraftBoat";
    }
}
