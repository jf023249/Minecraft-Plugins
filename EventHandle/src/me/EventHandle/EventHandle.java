package me.EventHandle;

import org.bukkit.plugin.java.JavaPlugin;


public class EventHandle extends JavaPlugin {

	@Override
	public void onEnable(){
		new PlayerListener(this);
	}

	@Override
	public void onDisable() {
		
	}
	
	
	
		
		
		
		
}
