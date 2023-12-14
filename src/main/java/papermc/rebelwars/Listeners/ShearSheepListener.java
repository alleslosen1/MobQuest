package papermc.rebelwars.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    public void onShearSheep(PlayerShearEntityEvent e) {
        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if (entity.getType() != EntityType.SHEEP) {
            e.setCancelled(true);
        }
        else {
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You cannot shear this sheep");
        }
    }
}
