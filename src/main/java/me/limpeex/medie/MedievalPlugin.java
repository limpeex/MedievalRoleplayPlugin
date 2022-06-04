package me.limpeex.medievalplugin;

import me.limpeex.medievalplugin.commands.*;
import me.limpeex.medievalplugin.events.*;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.print.Book;

public class MedievalPlugin extends JavaPlugin {
    public static MedievalPlugin plugin;
    public static Economy econ = null;
    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new EnchantEvent(), this);
        getServer().getPluginManager().registerEvents(new RespawnBlocker(), this);
        getServer().getPluginManager().registerEvents(new InteractBlock(), this);
        getServer().getPluginManager().registerEvents(new PlaceBlock(), this);
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new DeathEvent(), this);
        getServer().getPluginManager().registerEvents(new ChatMessage(), this);
        commandRegister();
        setupEconomy();
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
    public void commandRegister() {
        getCommand("shopitem").setExecutor(new ShopItemCommand());
        getCommand("badge").setExecutor(new BadgeCommand());
        getCommand("ironconverter").setExecutor(new ConverterCommand());
        getCommand("asgardsword").setExecutor(new AsgardSwordCommand());
        getCommand("warriorsword").setExecutor(new WarriorSwordCommand());
        getCommand("warriorshield").setExecutor(new Shield1Take());
        getCommand("armor").setExecutor(new ArmorTaker());
        getCommand("clan").setExecutor(new ClanCommand());
        getCommand("startwar").setExecutor(new StartWar());
        getCommand("openbook").setExecutor(new BookOpen());
        getCommand("arena").setExecutor(new Arena());
    }
}

