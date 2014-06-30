package me.tg.bw;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class BasicKit implements Listener{
	ItemStack Tool1 = new ItemStack(Material.STONE_SWORD);
	{
		
	}
	ItemStack Tool2 = new ItemStack(Material.STONE_AXE);
	{
		
	}
	ItemStack Tool3 = new ItemStack(Material.STONE_PICKAXE);
	{
		
	}
	ItemStack Tool4 = new ItemStack(Material.STONE_SPADE);
	{
		
	}
	ItemStack Material1 = new ItemStack(Material.WOOD,256);
	{
		
	}
	ItemStack Material2 = new ItemStack(Material.STONE,256);
	{
		
	}
	ItemStack Material3 = new ItemStack(Material.TNT,2);
	{
		
	}
	ItemStack Material4 = new ItemStack(Material.REDSTONE,32);
	{
		
	}
	ItemStack Material5 = new ItemStack(Material.TORCH,16);
	{
		
	}
	ItemStack[] kitdata = {Tool1, Tool2, Tool3, Tool4, Material1, Material2, Material3, Material4, Material5};
	
	public void give(Player p){
		p.getInventory().clear();
		p.getEquipment().clear();
		for(ItemStack x : kitdata){
			p.getInventory().addItem(x);
		}		
	}
	
	public void upgradedKit(Player p){
		PlayerInventory i = p.getInventory();
		
		//Give them all the blocks
		i.addItem(new ItemStack(Material.WOOD, 256));
		i.addItem(new ItemStack(Material.STONE, 256));
		i.addItem(new ItemStack(Material.OBSIDIAN, 16));
		i.addItem(new ItemStack(Material.TNT, 6));
		i.addItem(new ItemStack(Material.REDSTONE, 64));
		i.addItem(new ItemStack(Material.TORCH, 32));
		
		//Give them all the tools
		i.addItem(new ItemStack(Material.STONE_AXE));
		i.addItem(new ItemStack(Material.STONE_PICKAXE));
		i.addItem(new ItemStack(Material.IRON_SWORD));
		i.addItem(new ItemStack(Material.STONE_SPADE));
		i.addItem(new ItemStack(Material.COOKED_BEEF, 32));
	}
	
}
