package com.gmail.kurumitk78.milk.commands;

import com.gmail.kurumitk78.milk.Milk;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SetSaturation implements CommandExecutor {
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender.hasPermission("milk.setsaturation")) {

            if (args.length == 0) { //Checks if a value is given to be set
                sender.sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Proper usage: \"/setsaturation (value) \"");
            } else {
                Milk.plugin.getConfig().set("Saturation-Amount", Integer.parseInt(args[0])); //Sets the value in config
                Milk.plugin.saveConfig();
                sender.sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Value set!");
            }
        }

        return false;
    }
}
