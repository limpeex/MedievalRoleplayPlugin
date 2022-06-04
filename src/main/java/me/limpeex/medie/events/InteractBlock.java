package me.limpeex.medievalplugin.events;

import me.limpeex.medievalplugin.keys.Keys;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.TileState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class InteractBlock implements Listener{

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Block block = e.getClickedBlock();
        BlockState state = block.getState();
        if(state instanceof TileState) {
            if(e.getAction() == Action.LEFT_CLICK_BLOCK) {
                if(((TileState) state).getPersistentDataContainer().has(Keys.ironConverterKey, PersistentDataType.STRING)) {
                    if(e.getItem().isSimilar(new ItemStack(Material.IRON_INGOT))) {
                        int amount = e.getItem().getAmount();
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + e.getPlayer().getName() + " " + amount);
                        e.getPlayer().getInventory().setItemInMainHand(new ItemStack(Material.AIR));
                    }
                }else if(((TileState) state).getPersistentDataContainer().has(Keys.chestKeys, PersistentDataType.STRING)) {
                    if(e.getItem().isSimilar(new ItemStack(Material.IRON_INGOT))) {
                        if(e.getItem().getAmount() >= 3) {
                            int amount = e.getItem().getAmount();
                            e.getPlayer().getInventory().addItem(new ItemStack(Material.HORSE_SPAWN_EGG));
                            e.getPlayer().getInventory().addItem(new ItemStack(Material.SADDLE));
                            e.getItem().setAmount(amount - 3);
                        }
                    }
                }
            }

        }
    }
}
