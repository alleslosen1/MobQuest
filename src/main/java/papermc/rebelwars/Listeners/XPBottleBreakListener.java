package papermc.rebelwars.Listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

import java.net.http.WebSocket;

public class XPBottleBreakListener implements Listener {

    @EventHandler
    public void onXpBottleBreak(ExpBottleEvent e){
        Block block = e.getHitBlock();
        block.breakNaturally();
    }
}
