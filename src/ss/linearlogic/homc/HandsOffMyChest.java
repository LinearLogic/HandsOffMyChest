package ss.linearlogic.homc;

import org.bukkit.plugin.java.JavaPlugin;

public class HandsOffMyChest extends JavaPlugin {

	public void onEnable() {
		getLogger().info("Registering listener...");
		getServer().getPluginManager().registerEvents(new YeOldeListener(), this);
		getLogger().info("Enabled! No more unwanted groping of chests!");
	}

	public void onDisable() {
		getLogger().info("Disabled!");
	}
}
