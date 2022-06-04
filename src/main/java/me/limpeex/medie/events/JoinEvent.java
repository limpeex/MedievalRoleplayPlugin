package me.limpeex.medievalplugin.events;

import me.limpeex.medievalplugin.items.books.RuleBook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener{
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(!p.hasPlayedBefore()) {
            p.openBook(RuleBook.setupRuleBook());
        }
    }
}

