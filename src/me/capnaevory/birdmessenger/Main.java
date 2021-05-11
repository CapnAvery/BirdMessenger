package me.capnaevory.birdmessenger;

import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;

import me.capnaevory.birdmessenger.commands.sendbird;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		this.getCommand("Bird").setExecutor(new sendbird());
		
		//getServer().getScheduler().scheduleAsyncDelayedTask(this, new Runnable() {
		//	public void run() {
		//		for (int i = 0; i < array.length; i++) {
		//			
		//		}
		//		for (Entity entity : .getNearbyEntities(30, 30, 30)) {
		//               String entityName = entity.getCustomName();
		//               if(entityName != null) {
		//            	   if(entityName.equals(ChatColor.AQUA+"Message Bird")){
		//   		            entity.remove();
		//   				}
		//               }
		//               
		//		}}}, 20L);
	}
}