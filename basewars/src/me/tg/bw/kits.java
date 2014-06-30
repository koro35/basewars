package me.tg.bw;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class kits {

	public void basicKit(Player p){
		PlayerInventory i = p.getInventory();
		
		//Give them all the blocks
		i.addItem(new ItemStack(Material.WOOD, 256));
		i.addItem(new ItemStack(Material.STONE, 256));
		i.addItem(new ItemStack(Material.TNT, 2));
		i.addItem(new ItemStack(Material.REDSTONE, 32));
		i.addItem(new ItemStack(Material.TORCH, 16));
		
		//Give them all the tools
		i.addItem(new ItemStack(Material.STONE_AXE));
		i.addItem(new ItemStack(Material.STONE_PICKAXE));
		i.addItem(new ItemStack(Material.STONE_SWORD));
		i.addItem(new ItemStack(Material.STONE_SPADE));
		i.addItem(new ItemStack(Material.BREAD, 32));
		//
		
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
