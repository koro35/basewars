package me.tg.bw;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//Player p = (Player) sender;
		//reckless likes poopssss
		//even more
		if(sender instanceof Player){
			if(cmd.getName().equalsIgnoreCase("timer")){
				timer.startTimer();
			}
		}
		
		return false;
	}

}
