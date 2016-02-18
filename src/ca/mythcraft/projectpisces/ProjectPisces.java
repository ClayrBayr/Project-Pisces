package ca.mythcraft.projectpisces;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ProjectPisces extends JavaPlugin {

	public static final Logger logger = Bukkit.getServer().getLogger(); 
	
	@Override
	public void onEnable() {
		
		getCommand("fish").setExecutor(new CommandTest());
		
		logger.info("ProjectPisces has been enabled.");
	}

	@Override
	public void onDisable() {
		
		logger.info("ProjectPisces has been disabled");
	}

}

