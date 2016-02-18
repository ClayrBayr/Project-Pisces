package ca.mythcraft.projectpisces;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (label.equalsIgnoreCase("fish")) {
				
				player.sendMessage(ChatColor.BLUE + "You are now a fish");
				player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 10000, 1));

					
			}
			
		}
		else {
			
			ProjectPisces.logger.info("Only players can use this command");
			
		}
		
		return false;
	}

}
