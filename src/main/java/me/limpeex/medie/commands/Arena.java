package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.events.ChatMessage;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashSet;

public class Arena implements CommandExecutor {
    public static HashSet<Player> playersWhoSentMessages = new HashSet<>();
    public static HashSet<Player> playerWhoInvited = new HashSet<>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        playerWhoInvited.add(p);
        for(Player requested: Bukkit.getOnlinePlayers()) {
            if(ChatMessage.isBusy != false) {
                p.sendMessage("Arena dolu");
                break;
            }
            if(requested.getName().equalsIgnoreCase(strings[0])){
                requested.sendMessage(ChatColor.GREEN + p.getName() + ChatColor.BLUE + " Tarafından düelloya davet edildin, evet veya hayır yaz");
                playersWhoSentMessages.add(requested);
            }
        }
        return true;
    }
}

package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.events.ChatMessage;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashSet;

public class Arena implements CommandExecutor {
    public static HashSet<Player> playersWhoSentMessages = new HashSet<>();
    public static HashSet<Player> playerWhoInvited = new HashSet<>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        playerWhoInvited.add(p);
        for(Player requested: Bukkit.getOnlinePlayers()) {
            if(ChatMessage.isBusy != false) {
                p.sendMessage("Arena dolu");
                break;
            }
            if(requested.getName().equalsIgnoreCase(strings[0])){
                requested.sendMessage(ChatColor.GREEN + p.getName() + ChatColor.BLUE + " Tarafından düelloya davet edildin, evet veya hayır yaz");
                playersWhoSentMessages.add(requested);
            }
        }
        return true;
    }
}
