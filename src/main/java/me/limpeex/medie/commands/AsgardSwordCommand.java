package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.shopitems.swords.AsgardSword;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AsgardSwordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(p.isOp()) {
            p.getInventory().addItem(AsgardSword.setupNetherite1(ChatColor.DARK_GRAY + "Sword Of Asgard"));
        }
        return true;
    }
}
