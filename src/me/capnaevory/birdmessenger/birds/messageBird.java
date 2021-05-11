package me.capnaevory.birdmessenger.birds;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_16_R3.ChatComponentText;
import net.minecraft.server.v1_16_R3.EntityParrot;
import net.minecraft.server.v1_16_R3.EntityPlayer;
import net.minecraft.server.v1_16_R3.EntityTypes;
import net.minecraft.server.v1_16_R3.PathfinderGoalAvoidTarget;
import net.minecraft.server.v1_16_R3.PathfinderGoalPanic;
import net.minecraft.server.v1_16_R3.PathfinderGoalRandomFly;
import net.minecraft.server.v1_16_R3.PathfinderGoalRandomLookaround;
import net.minecraft.server.v1_16_R3.PathfinderGoalRandomStroll;

public class messageBird extends EntityParrot{

	
	public messageBird(Location loc) {
		super(EntityTypes.PARROT, ((CraftWorld) loc.getWorld()).getHandle());
		
		this.setPosition(loc.getX(), loc.getY(), loc.getZ());
		
		this.setCustomName(new ChatComponentText(ChatColor.AQUA+"Message Bird"));
		this.setCustomNameVisible(true);
		this.setHealth(100);
		
		this.goalSelector.a(0, new PathfinderGoalAvoidTarget<>(this, EntityPlayer.class, 30, 4.0D, 1.0D));
		this.goalSelector.a(1, new PathfinderGoalPanic(this, 2.0D));
		//this.goalSelector.a(2, new PathfinderGoalRandomFly(this, 0.6D));
		this.goalSelector.a(3, new PathfinderGoalRandomLookaround(this));
		
		
	}
}
