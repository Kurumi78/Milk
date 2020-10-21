package com.gmail.kurumitk78.milk.commands;

import com.gmail.kurumitk78.milk.Milk;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SetFood implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender.hasPermission("milk.setmilk")) {

            if (args.length == 0) {
                sender.sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Proper usage: \"/setmilk (value) \"");
            } else {
                Milk.plugin.getConfig().set("Food-Amount", Integer.parseInt(args[0]));
                Milk.plugin.saveConfig();
                sender.sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Value set!");
            }
        }

        return false;
    }

}
