package me.limpeex.medievalplugin.events;

import me.limpeex.medievalplugin.items.IronConverter;
import me.limpeex.medievalplugin.items.shopitems.ShopBlock;
import me.limpeex.medievalplugin.keys.Keys;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.TileState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PlaceBlock implements Listener{

    @EventHandler
    public void onBlockPlace (BlockPlaceEvent e) {
        Block block = e.getBlockPlaced();
        Player p = e.getPlayer();
        if(block.getState() instanceof TileState) {
            TileState state = (TileState) block.getState();
            PersistentDataContainer container = state.getPersistentDataContainer();
            if(block.getType() == Material.CHEST){
                if(p.getInventory().getItemInMainHand().isSimilar(IronConverter.getIronConverter())) {
                    container.set(Keys.ironConverterKey, PersistentDataType.STRING, "ironconverter");
                    state.update();
                }else if(p.getInventory().getItemInMainHand().isSimilar(ShopBlock.shopBlock)) {
                    container.set(Keys.chestKeys, PersistentDataType.STRING, "shopchest");
                    state.update();
                }
            }
        }
    }
}
