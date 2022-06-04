package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.shopitems.shields.WarriorShield;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Shield1Take implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(p.isOp()) {
            p.getInventory().addItem(WarriorShield.setupShield(ChatColor.DARK_GRAY + "The 'V' Shield"));
        }
        return true;
    }
}
