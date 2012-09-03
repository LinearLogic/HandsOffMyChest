package ss.linearlogic.homc;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HandsOffMyChest extends JavaPlugin
{
  private YeOldeListener listener = new YeOldeListener();

  public void onEnable() {
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(this.listener, this);
    YeOldeLogger.logInfo("Plugin successfully enabled! No more unwanted groping of chests!");
  }

  public void onDisable() {
    YeOldeLogger.logInfo("Plugin successfully disabled!");
  }
}