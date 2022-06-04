package me.limpeex.medievalplugin.items.shopitems;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;

public class ShopBlock {
    public static ItemStack shopBlock = new ItemStack(Material.CHEST);
    public static ItemStack setupShopBlock() {
        ItemMeta meta = shopBlock.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "SHOP");
        shopBlock.setItemMeta(meta);
        return shopBlock;
    }
}
