package ss.linearlogic.homc;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class YeOldeListener implements Listener {

	@EventHandler
	public void onInventoryOpen(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if (event.getClickedBlock() != null) {
			switch (event.getClickedBlock().getType()) {
			case CHEST:
				if (!player.hasPermission("handsoffmychest.chest")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to open chests!");
					event.setCancelled(true);
					return;
				}
				break;
			case ENDER_CHEST:
				if (!player.hasPermission("handsoffmychest.enderchest")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to open Ender chests!");
					event.setCancelled(true);
					return;
				}
				break;
			case WORKBENCH:
				if ((!player.hasPermission("handsoffmychest.workbench")) || !player.hasPermission("handsoffmychest.craftingtable")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to use crafting tables!");
					event.setCancelled(true);
					return;
				}
				break;
			case FURNACE:
				if (!player.hasPermission("handsoffmychest.furnace")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to use furnaces!");
					event.setCancelled(true);
					return;
				}
				break;
			case DISPENSER:
				if (!player.hasPermission("handsoffmychest.dispenser")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to use dispensers!");
					event.setCancelled(true);
					return;
				}
				break;
			case BREWING_STAND:
				if (!player.hasPermission("handsoffmychest.brewingstand") || !player.hasPermission("handsoffmychest.brewstand")) {
					player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to use brewing stands!");
					event.setCancelled(true);
					return;
				}
				break;
			default:
				break;
			}
			return;
		}
	}
}
