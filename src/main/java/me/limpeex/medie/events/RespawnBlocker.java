package me.limpeex.medievalplugin.events;

import me.limpeex.medievalplugin.MedievalPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.HashSet;
import java.util.UUID;

public class RespawnBlocker implements Listener {
    HashSet<UUID> deadUUIDS = new HashSet<>();
    public static int newTime;
    @EventHandler
    public void onRespawn(PlayerDeathEvent e) {
        if(ChatMessage.diePass.contains(e.getEntity())) {
            return;
        }
        e.setDeathMessage("");
        Player player = e.getEntity();
        deadUUIDS.add(player.getUniqueId());
        player.spigot().respawn();
        Location hospital = new Location(Bukkit.getWorld("world"), 170.424, 93, 159.749);
        player.teleport(hospital);
        player.sendRawMessage(ChatColor.YELLOW + "Doktorlar tarafından tedavi ediliyorsunuz lütfen bekleyin...");
        new BukkitRunnable() {
            int remainedTime = 20;
            @Override
            public void run() {
                if(player.isOnline()) {
                    if(remainedTime == 0) {
                        if(MedievalPlugin.econ.getBalance(player) < 200) {
                            player.sendMessage(ChatColor.GOLD + "Tedaviniz Gerçekleşti...");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + player.getName() + " 50");
                            player.sendMessage(ChatColor.GOLD + "Yeteri kadar paranız yok... Borca girdiniz...");
                            deadUUIDS.remove(player.getUniqueId());
                            cancel();
                        }else {
                            player.sendMessage(ChatColor.GOLD + "Tedaviniz Gerçekleşti...");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + player.getName() + " 50");
                            deadUUIDS.remove(player.getUniqueId());
                            cancel();
                        }
                    }else {
                        player.sendMessage(ChatColor.GOLD + "" + remainedTime + " Saniyeniz kaldı...");
                        remainedTime--;
                        player.sleep(hospital, true);
                    }
                }else {
                    cancel();
                }
            }
        }.runTaskTimer(MedievalPlugin.plugin, 0, 20L);
    }
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if(deadUUIDS.contains(e.getPlayer().getUniqueId())) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage("");
        Location hospital = new Location(Bukkit.getWorld("world"), 170.424, 93, 159.749);
        Player player = e.getPlayer();
        if(deadUUIDS.contains(player.getUniqueId())) {
            if(player.isOnline()) {
                new BukkitRunnable() {
                    int remainedTime = 20;
                    @Override
                    public void run() {
                        if(player.isOnline()) {
                            if(remainedTime == 0) {
                                if(MedievalPlugin.econ.getBalance(player) < 200) {
                                    player.sendMessage(ChatColor.GOLD + "Tedaviniz Gerçekleşti...");
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + player.getName() + " 50");
                                    player.sendMessage(ChatColor.GOLD + " Yeteri kadar paranız yok... Borca girdiniz...");
                                    deadUUIDS.remove(player.getUniqueId());
                                    cancel();
                                }else {
                                    player.sendMessage(ChatColor.GOLD + "Tedaviniz Gerçekleşti...");
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + player.getName() + " 50");
                                    deadUUIDS.remove(player.getUniqueId());
                                    cancel();
                                }
                            }else {
                                player.sendMessage(ChatColor.GOLD + "" + remainedTime + " Saniyeniz kaldı...");
                                remainedTime--;
                            }
                        }else {
                            cancel();
                        }
                    }
                }.runTaskTimer(MedievalPlugin.plugin, 0, 20L);
            }
        }
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage("");
    }
}
