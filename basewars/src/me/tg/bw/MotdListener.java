package me.tg.bw;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MotdListener implements Listener {
	static int phase = 1;
	public static void setPhase(int number){
		phase = number;
	}
	public static int getPhase(){
		return phase;
	}
	@EventHandler
	public void onServerListPing(ServerListPingEvent e) {
		e.setMotd("Phase: " + phase);
	}
}
