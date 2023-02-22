package morecosmetics.paper;

import morecosmetics.paper.Items.Items;
import morecosmetics.paper.gui.Recipecommand;
import morecosmetics.paper.gui.recipesListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getCommand("recipes").setExecutor(new Recipecommand());

        Items.MakeItems();
        Bukkit.getPluginManager().registerEvents((Listener)new recipesListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents(this, (Plugin)this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().setResourcePack("https://www.dropbox.com/s/uyigatigvongrk9/MoreCosmetics-ResourcePack%20-1.19.3.zip?dl=1");
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e)
    {
        Player player = e.getPlayer();
        try {
            Recipecommand.playerinv.remove(player);
        }catch (NullPointerException error) {

        }
    }

    @EventHandler
    public void onResourceStatus(PlayerResourcePackStatusEvent e) {
        if (e.getStatus().equals(PlayerResourcePackStatusEvent.Status.DECLINED))
            do {
                e.getPlayer().kickPlayer("you need server resource packs enabled");
            } while (e.getStatus().equals(PlayerResourcePackStatusEvent.Status.ACCEPTED));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
