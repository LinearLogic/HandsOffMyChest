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
			String nodeExt = "", block = ""; // If block string is nodeExt + "s", block string's value isn't changed
			switch (event.getClickedBlock().getType()) {
			case CHEST:
				nodeExt = "chest";
				break;
			case ENDER_CHEST:
				nodeExt = "enderchest";
				break;
			case WORKBENCH:
				nodeExt = "workbench";
				block = "crafting tables";
				break;
			case FURNACE:
				nodeExt = "furnace";
				break;
			case DISPENSER:
				nodeExt = "dispenser";
				break;
			case BREWING_STAND:
				nodeExt = "brewingstand";
				block = "brewing stands";
				break;
			default:
				break;
			}
			if (nodeExt.equals(""))
				return;
			if (!player.hasPermission("handsoffmychest." + nodeExt)) {
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "Oh noes! You aren't permitted to use " + (block.equals("") ? nodeExt +
						"s" : block) + "!");
			}
		}
	}
}
