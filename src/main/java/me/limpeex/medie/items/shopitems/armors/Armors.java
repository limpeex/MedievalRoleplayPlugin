package me.limpeex.medievalplugin.items.shopitems.armors;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Armors {
    public static ItemStack asgardBoots = new ItemStack(Material.NETHERITE_BOOTS);
    public static ItemStack asgardChest = new ItemStack(Material.NETHERITE_CHESTPLATE);
    public static ItemStack asgardLeggings = new ItemStack(Material.NETHERITE_LEGGINGS);
    public static ItemStack asgardHelmet = new ItemStack(Material.NETHERITE_HELMET);
    public static ItemStack warriorHelmet = new ItemStack(Material.IRON_HELMET);
    public static ItemStack warriorChest = new ItemStack(Material.IRON_CHESTPLATE);
    public static ItemStack warriorLeggings = new ItemStack(Material.IRON_LEGGINGS);
    public static ItemStack warriorBoots = new ItemStack(Material.IRON_BOOTS);
    public static ItemStack setupAsgardBoots(String text) {
        ItemMeta meta = asgardBoots.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Asgard zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Ağır ve kırılması zor");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Shield görevi bile görebilir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        asgardBoots.setItemMeta(meta);
        return asgardBoots;
    }
    public static ItemStack setupHelmet(String text) {
        ItemMeta meta = asgardHelmet.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Asgard zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Ağır ve kırılması zor");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Shield görevi bile görebilir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        asgardHelmet.setItemMeta(meta);
        return asgardHelmet;
    }
    public static ItemStack setupChest(String text) {
        ItemMeta meta = asgardChest.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Asgard zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Ağır ve kırılması zor");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Shield görevi bile görebilir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        asgardChest.setItemMeta(meta);
        return asgardChest;
    }
    public static ItemStack setupLeggings(String text) {
        ItemMeta meta = asgardLeggings.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Asgard zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Ağır ve kırılması zor");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Shield görevi bile görebilir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        asgardLeggings.setItemMeta(meta);
        return asgardLeggings;
    }
    public static ItemStack setupBoots(String text) {
        ItemMeta meta = asgardBoots.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Asgard zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Ağır ve kırılması zor");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Shield görevi bile görebilir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        asgardBoots.setItemMeta(meta);
        return asgardBoots;
    }
    public static ItemStack setupWarriorHelmet(String text) {
        ItemMeta meta = warriorHelmet.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Savaşçı zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Hafif bir zırh ve düşme şansı pek yok");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yakın dövüşte etkilidir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        warriorHelmet.setItemMeta(meta);
        return warriorHelmet;
    }
    public static ItemStack setupWarriorChest(String text) {
        ItemMeta meta = warriorChest.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Savaşçı zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Hafif bir zırh ve düşme şansı pek yok");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yakın dövüşte etkilidir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        warriorChest.setItemMeta(meta);
        return warriorChest;
    }
    public static ItemStack setupWarriorLeggings(String text) {
        ItemMeta meta = warriorLeggings.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Savaşçı zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Hafif bir zırh ve düşme şansı pek yok");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yakın dövüşte etkilidir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        warriorLeggings.setItemMeta(meta);
        return warriorLeggings;
    }
    public static ItemStack setupWarriorBoots(String text) {
        ItemMeta meta = warriorBoots.getItemMeta();
        meta.setDisplayName(text);
        ArrayList<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        lore.add(ChatColor.GOLD + "--------------------------------");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Güçlü Savaşçı zırhı");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Hafif bir zırh ve düşme şansı pek yok");
        lore.add(ChatColor.GOLD + "   * " + ChatColor.DARK_GREEN + "Yakın dövüşte etkilidir");
        lore.add(ChatColor.GOLD + "--------------------------------");
        meta.setLore(lore);
        warriorBoots.setItemMeta(meta);
        return warriorBoots;
    }
}
