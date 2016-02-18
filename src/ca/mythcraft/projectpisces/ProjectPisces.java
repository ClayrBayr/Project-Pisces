package ca.mythcraft.projectpisces;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ProjectPisces extends JavaPlugin {
	
	public static final Logger logger = Bukkit.getServer().getLogger();
	
	@Override
	public void onEnable() {
		
		getCommand("fish").setExecutor(new TestCommand());
		
		logger.info("Project Pisces has been enabled");
	}
	
	@Override
	public void onDisable() {
		
		logger.info("Project Pisces has been disabled");
	}

}
