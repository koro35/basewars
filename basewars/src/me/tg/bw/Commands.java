package me.tg.bw;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){//What is happening?
			if(cmd.getName().equalsIgnoreCase("bw")){
				if(args.length == 1 && args[0].equalsIgnoreCase("start")){
					timer.startTimer();					
				}else{
					sender.sendMessage("[BW] You're not allowed to use this command.");
				}
			}
		}
		
		return false;
	}

}
