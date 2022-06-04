package me.limpeex.medievalplugin.items;

import me.limpeex.medievalplugin.MedievalPlugin;
import me.limpeex.medievalplugin.keys.Keys;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class IronConverter {
    private static ItemStack ironConverter = new ItemStack(Material.CHEST);
    public static ItemStack setupIronConverter(String a, String text) {
        ItemMeta meta = ironConverter.getItemMeta();
        PersistentDataContainer ironConverterContainer = meta.getPersistentDataContainer();
        ironConverterContainer.set(Keys.ironConverterKey, PersistentDataType.STRING, a);
        meta.setDisplayName(text);
        ironConverter.setItemMeta(meta);
        return ironConverter;
    }

    public static ItemStack getIronConverter() {
        return ironConverter;
    }
}
