package papermc.rebelwars;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class Rebelwars extends JavaPlugin implements Listener {

    @Override
    public @NotNull Logger getLogger() {
        return super.getLogger();
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin start");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        getLogger().info("A player has joined the server");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin end");
    }
}
