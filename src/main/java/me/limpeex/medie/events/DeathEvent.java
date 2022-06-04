package me.limpeex.medievalplugin.events;

import me.limpeex.medievalplugin.commands.Arena;
import me.limpeex.medievalplugin.commands.StartWar;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener{
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        ChatMessage.arenaPlayers.remove(e.getEntity());
        if(p.hasPermission(StartWar.firstClan.get(0))) {
            StartWar.firstTeam.remove(p);
            p.sendTitle(ChatColor.DARK_RED + "Yaralandın", ChatColor.DARK_GRAY + "Savaşta Artık Olamayacaksın", 50, 50, 50);
        }else if(p.hasPermission(StartWar.secondClan.get(0))) {
            StartWar.secondTeam.remove(p);
            p.sendTitle(ChatColor.DARK_RED + "Yaralandın", ChatColor.DARK_GRAY + "Savaşta Artık Olamayacaksın", 50, 50, 50);
        }
    }
}
