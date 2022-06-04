package me.limpeex.medievalplugin.items;

import me.limpeex.medievalplugin.MedievalPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class Badges {
    static NamespacedKey namespacedKey = new NamespacedKey(MedievalPlugin.plugin, "badges");
    private static ItemStack raketlaw = new ItemStack(Material.LEAD);
    private static ItemStack mottlegard = new ItemStack(Material.LEAD);
    public static ItemStack setupBadge(ItemStack badge, String a, String text) {
        ItemMeta meta = badge.getItemMeta();
        PersistentDataContainer raketlawContaioner = meta.getPersistentDataContainer();
        raketlawContaioner.set(namespacedKey, PersistentDataType.STRING, a);
        meta.setDisplayName(text);
        badge.setItemMeta(meta);
        return badge;
    }
    public static ItemStack getRaketlaw() {
        return raketlaw;
    }

    public static void setRaketlaw(ItemStack raketlaw) {
        Badges.raketlaw = raketlaw;
    }

    public static ItemStack getMottlegard() {
        return mottlegard;
    }

    public static void setMottlegard(ItemStack mottlegard) {
        Badges.mottlegard = mottlegard;
    }
}
