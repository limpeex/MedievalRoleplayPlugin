package me.limpeex.medievalplugin.items.shopitems.swords;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class AsgardSword {
    public static ItemStack netherite1 = new ItemStack(Material.NETHERITE_SWORD);
    public static ItemStack setupNetherite1(String text) {
        ItemMeta meta = netherite1.getItemMeta();
        meta.setCustomModelData(1);
        meta.setDisplayName(text);
        ArrayList<String> netherite1Lore = new ArrayList<>();
        meta.addEnchant(Enchantment.KNOCKBACK, 4, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        netherite1Lore.add(ChatColor.GOLD + "--------------------------------");
        netherite1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Agir kilic");
        netherite1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Kullanilmasi Zor");
        netherite1Lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yüklü savaşlar için avantajlı");
        netherite1Lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(netherite1Lore);
        netherite1.setItemMeta(meta);
        return netherite1;
    }
}
