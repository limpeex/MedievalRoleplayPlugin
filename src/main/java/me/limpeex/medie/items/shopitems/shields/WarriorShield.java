package me.limpeex.medievalplugin.items.shopitems.shields;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class WarriorShield {
    public static ItemStack warriorShield = new ItemStack(Material.SHIELD);
    public static ItemStack setupShield(String text) {
        ItemMeta meta = warriorShield.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Savaşçı kalkanı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü kalkan");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Kırılması zor");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        warriorShield.setItemMeta(meta);
        return warriorShield;
    }
}
