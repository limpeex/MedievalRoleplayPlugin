package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.shopitems.armors.Armors;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ArmorTaker implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player)commandSender;
        if(strings[0].equalsIgnoreCase("asgardhelmet")) {
            p.getInventory().addItem(Armors.setupHelmet(ChatColor.DARK_GRAY + "Asgard Helmet"));
        }else if(strings[0].equalsIgnoreCase("asgardchest")) {
            p.getInventory().addItem(Armors.setupChest(ChatColor.DARK_GRAY + "Asgard ChestPlate"));
        }else if(strings[0].equalsIgnoreCase("asgardleggings")) {
            p.getInventory().addItem(Armors.setupLeggings(ChatColor.DARK_GRAY + "Asgard Leggings"));
        }else if(strings[0].equalsIgnoreCase("asgardboots")) {
            p.getInventory().addItem(Armors.setupBoots(ChatColor.DARK_GRAY + "Asgard Boots"));
        }else if(strings[0].equalsIgnoreCase("warriorhelmet")) {
            p.getInventory().addItem(Armors.setupWarriorHelmet(ChatColor.DARK_GRAY + "Warrior Helmet"));
        }else if(strings[0].equalsIgnoreCase("warriorchest")) {
            p.getInventory().addItem(Armors.setupWarriorChest(ChatColor.DARK_GRAY + "Warrior ChestPlate"));
        }else if(strings[0].equalsIgnoreCase("warriorleggings")) {
            p.getInventory().addItem(Armors.setupWarriorLeggings(ChatColor.DARK_GRAY + "Warrior Leggings"));
        }else if(strings[0].equalsIgnoreCase("warriorboots")) {
            p.getInventory().addItem(Armors.setupWarriorBoots(ChatColor.DARK_GRAY + "Warrior Boots"));
        }
        return true;
    }
}
