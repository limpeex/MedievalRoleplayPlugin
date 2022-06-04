package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.shopitems.swords.WarriorSword;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarriorSwordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(p.isOp()) {
            p.getInventory().addItem(WarriorSword.setupIron1(ChatColor.DARK_GRAY + "Warrior Sword"));
        }
        return true;
    }
}
