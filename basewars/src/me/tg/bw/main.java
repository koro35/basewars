package me.tg.bw;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin implements Listener{ 
public final Logger logger = Logger.getLogger("Minecraft");
public static Plugin plugin;


	@Override
 	public void onEnable(){
	 	plugin = this;
	 	this.logger.info("[BaseWars] Plugin enabled.");
	 	registerEvents(this, new DamageEvent());
	 	getCommand("timer").setExecutor(new Commands());


 	}
 	public void onDisable(){
 		plugin = this;
 		this.logger.info("[BaseWars] Plugin disabled.");
 	}

 
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    //To access the plugin variable from other classes
    public static Plugin getPlugin() {
        return plugin;
    }
}