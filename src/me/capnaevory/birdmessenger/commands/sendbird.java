package me.capnaevory.birdmessenger.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Player;

import me.capnaevory.birdmessenger.birds.messageBird;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_16_R3.WorldServer;

public class sendbird implements CommandExecutor{
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player sendingPlayer = (Player) sender;
			
			
			if(args.length == 0) {
				sendingPlayer.sendMessage("Please enter a player name!");
			} else {
				Player target = Bukkit.getPlayerExact(args[0]);
				if(target instanceof Player) {
					
					if((label.equalsIgnoreCase(label))) {
						if(args.length == 0){
							sendingPlayer.sendMessage(ChatColor.DARK_RED + "Incorrect Usage! Correct Usage: /bird (player) (message)");
			            }
			            else if(args.length == 1){
			            	sendingPlayer.sendMessage(ChatColor.DARK_RED + "Incorrect Usage! Correct Usage: /bird (player) (message)");
			            }
			            else if(args.length>1) {
			            	Location loc = target.getLocation();
							int x = loc.getBlockX()+10;
							int y = loc.getBlockY()+10;
							int z = loc.getBlockZ()+10;
							sendingPlayer.sendMessage(ChatColor.GREEN+"message has been sent to "+target.getName());
							
							Location comingDown = new Location(target.getWorld(), x, y, z);
							messageBird goodBird = new messageBird(target.getPlayer().getLocation());
							WorldServer world = ((CraftWorld) target.getPlayer().getWorld()).getHandle();
							
							world.addEntity(goodBird);
							
							target.sendMessage(ChatColor.GOLD+"A bird swoops down before you, dropping off a piece of parchement");
							
							String message = "";
							for (int i = 1; i < args.length; i++) {
								message = message+args[i]+" ";
							}
						
							target.sendMessage(ChatColor.GREEN + "You open the parchement given by the bird, and it reads '"
							+ChatColor.BOLD+ChatColor.BLUE+ ChatColor.ITALIC +message+ChatColor.GREEN +"'");
							
							
							}
			            }
					}
				} 
			}
		{
		return false;
	}
	
	
		
		
		
	}
	
	
	
}
