package me.limpeex.medievalplugin.commands;

import me.limpeex.medievalplugin.items.books.RuleBook;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BookOpen implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        p.getInventory().addItem(RuleBook.setupRuleBook());
        return true;
    }
}
