package me.plugin.drakeofMinecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		if(cmd.getName().equalsIgnoreCase("hello") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + "!");
			
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("damage") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.damage(3.0);
			player.sendMessage("Damage Invoked!");
	
			
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("currentweather") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.sendMessage("The current weather is: " + player.getPlayerWeather());
		}
		
		return false;
	}
	
	
}
