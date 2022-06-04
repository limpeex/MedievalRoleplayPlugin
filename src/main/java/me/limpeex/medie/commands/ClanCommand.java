package me.limpeex.medievalplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class ClanCommand implements CommandExecutor {
    private ArrayList<String> groupList = new ArrayList<>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        groupList.add(ChatColor.DARK_PURPLE + "mottlegard");
        groupList.add(ChatColor.GOLD + "raketlaw");
        Player p = (Player) commandSender;
        for(String perm: groupList) {
            if(p.hasPermission(perm)) {
                p.sendMessage(perm);
            }
        }
        return true;
    }
}
