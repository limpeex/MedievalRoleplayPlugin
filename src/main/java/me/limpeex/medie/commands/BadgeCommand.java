package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.Badges;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BadgeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (p.isOp()) {
            if (strings[0].equalsIgnoreCase("mottlegard")) {
                Badges.setupBadge(Badges.getMottlegard(), "mottlegard", ChatColor.LIGHT_PURPLE + "Mottlegard Bracelet");
                p.getInventory().addItem(Badges.getMottlegard());
            } else if (strings[0].equalsIgnoreCase("raketlaw")) {
                Badges.setupBadge(Badges.getRaketlaw(), "raketlaw", ChatColor.YELLOW + "Raketlaw Bracelet");
                p.getInventory().addItem(Badges.getRaketlaw());
            }
        }
        return true;
    }
}
