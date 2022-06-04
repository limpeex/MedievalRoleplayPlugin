package me.limpeex.medievalplugin.items.books;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.awt.print.Book;
import java.util.ArrayList;

public class RuleBook {
    static ArrayList<String> lore = new ArrayList<>();
    private static ItemStack ruleBook = new ItemStack(Material.WRITTEN_BOOK);
    public static ItemStack setupRuleBook() {
        BookMeta meta = (BookMeta) ruleBook.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Sunucuya Giriş, Kurallar");
        meta.setAuthor("limpeex");
        meta.setTitle("BLANK");
        lore.add(ChatColor.BLACK + "-------------------" + ChatColor.GOLD + " Sunucuya Hoşgeldiniz "+ ChatColor.BLACK + "-------------------"+ ChatColor.BLACK + "* " + ChatColor.DARK_AQUA + "Lütfen her şeyi sonuna kadar okuyarak hiçbir şey kaçırmamaya çalışın..." + ChatColor.BLACK + "                  -------------------" + "* " + ChatColor.DARK_BLUE + "Discord: https://discord.gg/Tj6eJXCsrk");
        lore.add(ChatColor.BLACK + "* " + ChatColor.GOLD + "Öncelikle boş bir üye olarak oynamak istiyorsanız (Aşırı Zor) gelişmeniz çok ileri seviyede zor olacaktır. Bizim sunucumuz bir Roleplay sunucusu olduğundan chate yazdıklarınız sadece yakınınızdaki kişiler tarafından görülür. Eğer tek başınıza rol yapmak istemiyor, bir");
        lore.add(ChatColor.BLACK + "* " + ChatColor.GOLD + "Klana katılmak istiyorsanız Discord sunucumuza gelerek bir klan seçebilir ve haftalık olarak klan savaşlarına girebilirsiniz. Ayrıca Discord sunucumuza gelerek bütün marketlerin, klanların yerlerini ve scriptlerin mekanizması hakkında bilgi alabilirsiniz");
        lore.add(ChatColor.DARK_GREEN + " Sunucuya Hoşgeldiniz " + ChatColor.BLACK + "-------------------");
        meta.setPages(lore);
        ruleBook.setItemMeta(meta);
        return ruleBook;
    }

    public static ItemStack getRuleBook() {
        return ruleBook;
    }
}
