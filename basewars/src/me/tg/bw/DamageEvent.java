package me.tg.bw;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DamageEvent implements Listener {

	@EventHandler
	public void onDamageEvent(EntityDamageByEntityEvent event){
		
		if(pvp.isPvpEnabled == true){
			event.setCancelled(false);
		} else if (pvp.isPvpEnabled == false){
			event.setCancelled(true);
		}
		
	}
	
}
