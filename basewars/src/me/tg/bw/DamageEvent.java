package me.tg.bw;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DamageEvent implements Listener {

	@EventHandler
	public void onDamageEvent(EntityDamageByEntityEvent event){
		//Edit 2, checking for true is bullshit. It looks like shit
		if(pvp.isPvpEnabled){
			event.setCancelled(false);
		} else if (pvp.isPvpEnabled == false){
			event.setCancelled(true);
		}
		
	}
	
}
