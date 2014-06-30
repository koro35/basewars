package me.tg.bw;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player){//We can't use the console now for this command?
			if(cmd.getName().equalsIgnoreCase("timer")){
				timer.startTimer();
			}
		}
		
		return false;
	}

}
