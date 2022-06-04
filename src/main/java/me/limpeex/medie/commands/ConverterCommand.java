package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.IronConverter;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConverterCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.isOp()) {
            Player p = (Player) commandSender;
            p.getInventory().addItem(IronConverter.setupIronConverter("ironconverter", ChatColor.GRAY + "Iron Converter"));
        }
        return true;
    }
}
