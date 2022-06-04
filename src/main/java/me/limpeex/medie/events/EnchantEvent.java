package me.limpeex.medievalplugin.events;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

import java.util.HashSet;

public class EnchantEvent implements Listener{
    public static HashSet<Inventory> inventories = new HashSet<>();
    @EventHandler
    public void onEnch(PrepareAnvilEvent e) {
        inventories.add(e.getInventory());
    }
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        for(Inventory i: inventories) {
            if(e.getClickedInventory() == null) {
                return;
            }else if(e.getClickedInventory().equals(i)) {
                if(!p.hasPermission("enchpass")) {
                    e.setCancelled(true);
                    e.getWhoClicked().sendMessage(ChatColor.DARK_AQUA + "Büyü yeteneğiniz yok..");
                }
            }
        }
    }
}
