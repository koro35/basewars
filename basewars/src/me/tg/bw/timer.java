package me.tg.bw;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class timer {
	private static int left = 60 * 199;
	public static int timeleft = 120;

	public static void startTimer() {
		
		
		pvp.isPvpEnabled = false;
		
		Bukkit.broadcastMessage(ChatColor.DARK_RED
				+ "============= PVP ENABLED SOON! =============");
		Bukkit.broadcastMessage(ChatColor.RED
				+ "      60 seconds left until the game starts!");
		Bukkit.broadcastMessage(ChatColor.DARK_RED
				+ "============= PVP ENABLED SOON! =============");
		//int gamestarted = 1;
		new Runnable() {
			public int taskID = Bukkit.getScheduler()
					.scheduleSyncRepeatingTask(main.plugin, this, 0L, 20L);

			@Override
			public void run() {
				if (left > 0) {
					left--;
					if (timeleft > 0) {
						timeleft--;
					}
				
					switch (left) {
					case 11925:
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						Bukkit.broadcastMessage(ChatColor.RED
								+ "        45 seconds left until the game starts!");
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						break;
					case 11910:
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						Bukkit.broadcastMessage(ChatColor.RED
								+ "        30 seconds left until the game starts!");
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						break;
					case 11895:
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						Bukkit.broadcastMessage(ChatColor.RED
								+ "        15 seconds left until the game starts!");
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED SOON! =============");
						break;
					case 11885:
						Bukkit.broadcastMessage(ChatColor.RED
								+ "5 seconds left until the pvp is enabled!");
						break;
					case 11884:
						Bukkit.broadcastMessage(ChatColor.RED
								+ "4 seconds left until the pvp is enabled!");
						break;
					case 11883:
						Bukkit.broadcastMessage(ChatColor.RED
								+ "3 seconds left until the pvp is enabled!");
						break;
					case 11882:
						Bukkit.broadcastMessage(ChatColor.RED
								+ "2 seconds left until the pvp is enabled!");
						break;
					case 11881:
						Bukkit.broadcastMessage(ChatColor.RED
								+ "1 seconds left until the pvp is enabled!");
						break;
					case 11880:
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED! =============");
						Bukkit.broadcastMessage(ChatColor.RED
								+ "   Have fun, remember hacking is not allowed!");
						Bukkit.broadcastMessage(ChatColor.DARK_RED
								+ "============= PVP ENABLED! =============");
						
						pvp.isPvpEnabled = true;
						
						break;
					} 
				} else {
					Bukkit.getScheduler().cancelTask(taskID);
			}
		}
			
		};
	}
}
