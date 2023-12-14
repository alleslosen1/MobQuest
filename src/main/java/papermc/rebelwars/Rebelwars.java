package papermc.rebelwars;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class Rebelwars extends JavaPlugin {

    @Override
    public @NotNull Logger getLogger() {
        return super.getLogger();
    }

    @Override
    public void onEnable() {
        getLogger().info("Test start");

    }

    @Override
    public void onDisable() {
        getLogger().info("Test end");
    }
}
