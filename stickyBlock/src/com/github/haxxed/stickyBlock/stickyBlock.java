package com.github.haxxed.stickyBlock;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class stickyBlock extends JavaPlugin {
	public static void main(String[] args) {
	}
	Logger log;
	 
	public void onEnable(){
		log = this.getLogger();
		log.info("stickyBlock has been enabled!");
		saveDefaultConfig();
		saveResource("plugins/stickyBlock/config.yml", false);
	}
 
	public void onDisable(){
		log.info("stickyBlock has been disabled. :(");
	}
   
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if((sender instanceof Player)){ // make sure it's a player
    			if(cmd.getName().equalsIgnoreCase("stick")){ // If the player typed /stick then do the following...
    				sender.sendMessage(ChatColor.GREEN +"Well, at least this part works!");
    			return true;
    			} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
    			sender.sendMessage(ChatColor.RED +"Sorry, you can't do this.");
    		return false; 
			}
		else {
        sender.sendMessage(ChatColor.RED + "You must be a player!");
        return false;
		}
	}
}