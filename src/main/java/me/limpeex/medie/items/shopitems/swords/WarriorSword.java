package me.limpeex.medievalplugin.items.shopitems.swords;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class WarriorSword {
    public static ItemStack ironsword1 = new ItemStack(Material.IRON_SWORD);
    public static ItemStack setupIron1(String text) {
        ItemMeta meta = ironsword1.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> iron1Lore = new ArrayList<>();
        meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        meta.setUnbreakable(false);
        iron1Lore.add(ChatColor.GOLD + "--------------------------------");
        iron1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Standart ortaçağ kılıcı");
        iron1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Kullanılması basit");
        iron1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yakın dövüşte avantajlı");
        iron1Lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(iron1Lore);
        ironsword1.setItemMeta(meta);
        return ironsword1;
    }
}
