package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.MedievalPlugin;
import me.limpeex.medievalplugin.clans.Clan;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class StartWar implements CommandExecutor {
    public static HashSet<Player> firstTeam = new HashSet<>();
    public static HashSet<Player> secondTeam = new HashSet<>();
    public static HashSet<Player> allFightPlayers = new HashSet<>();
    public static ArrayList<String> firstClan = new ArrayList<>();
    public static ArrayList<String> secondClan = new ArrayList<>();
    static int warTime = 400;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(p.hasPermission("warauthority")) {
            firstClan.add(strings[0]);
            secondClan.add(strings[1]);
            Clan mottlegard = new Clan(ChatColor.DARK_PURPLE + "Mottlegard");
            Clan raketlaw = new Clan(ChatColor.GOLD + "Raketlaw");
            for(Player z: Bukkit.getOnlinePlayers()) {
                if(z.hasPermission(strings[0])) {
                    firstTeam.add(z);
                    allFightPlayers.add(z);
                }else if(z.hasPermission(strings[1])) {
                    secondTeam.add(z);
                    allFightPlayers.add(z);
                }
            }
            new BukkitRunnable() {
                @Override
                public void run() {
                    if(!firstTeam.isEmpty() || !secondTeam.isEmpty()) {
                        if(warTime == 0) {
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.BLUE  + "Mücadele Berabere Bitmiştir", ChatColor.AQUA + "Lütfen Savaşmayı Bırakın");
                            }
                            cancel();
                        }
                        else if(warTime == 300) {
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.DARK_RED +"!!", ChatColor.DARK_GRAY + "300 Saniye Kaldı", 50, 50,50);
                            }
                        }else if(warTime == 200){
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.DARK_RED +"!!", ChatColor.DARK_GRAY + "200 Saniye Kaldı", 50, 50,50);
                            }
                        }else if(warTime == 100){
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.DARK_RED +"!!", ChatColor.DARK_GRAY + "100 Saniye Kaldı", 50, 50,50);
                            }
                        }else if(warTime == 50){
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.DARK_RED +"!!", ChatColor.DARK_GRAY + "50 Saniye Kaldı", 50, 50,50);
                            }
                        }else if(warTime <= 10) {
                            for(Player u: allFightPlayers) {
                                u.sendTitle(ChatColor.DARK_RED +"!!", ChatColor.DARK_GRAY + "Savaşın Bitmesine 10 Saniye Kaldı", 50, 50,50);
                                u.sendTitle(" ", ChatColor.RED + "" + warTime, 20, 20 ,20);
                            }
                        }
                        warTime--;
                    }else if(firstTeam.isEmpty()) {
                        for(Player u: allFightPlayers) {
                            if(u.hasPermission(strings[0])) {
                                u.sendTitle(ChatColor.DARK_RED + "YENILDINIZ", "Bir Dahaki Sefere", 50, 50 ,50);
                            }else if(u.hasPermission(strings[1])) {
                                u.sendTitle(ChatColor.DARK_GREEN + "YENDINIZ", "Tebrikler", 50, 50 ,50);

                            }
                        }
                        cancel();
                    }else if(secondTeam.isEmpty()) {
                        for(Player u: allFightPlayers) {
                            if(u.hasPermission(strings[0])) {
                                u.sendTitle(ChatColor.DARK_GREEN + "YENDINIZ", "Tebrikler", 50, 50 ,50);
                            }else if(u.hasPermission(strings[1])) {
                                u.sendTitle(ChatColor.DARK_RED + "YENILDINIZ", "Bir Dahaki Sefere", 50, 50 ,50);
                            }
                        }
                        cancel();
                    }
                }
            }.runTaskTimer(MedievalPlugin.plugin, 0L, 20L);
            for(Player z: Bukkit.getOnlinePlayers()) {
                if(z.hasPermission(strings[0])) {
                    z.sendTitle(ChatColor.DARK_RED +  strings[0] + " Savaşçısı", ChatColor.DARK_GRAY + "Savaş başladı, Klanını savun", 50, 50, 50);
                }else if(z.hasPermission(strings[1])) {
                    z.sendTitle(ChatColor.DARK_RED +  strings[1] + " Savaşçısı", ChatColor.DARK_GRAY + "Savaş başladı, Klanını savun", 50, 50, 50);
                }
            }
        }
        return true;
    }
}
