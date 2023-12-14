package papermc.rebelwars;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import papermc.rebelwars.Listeners.XPBottleBreakListener;

import java.util.logging.Logger;

public final class Rebelwars extends JavaPlugin {

    @Override
    public @NotNull Logger getLogger() {
        return super.getLogger();
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin start");
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
    }


    @Override
    public void onDisable() {
        getLogger().info("Plugin end");
    }
}
