package com.gmail.kurumitk78.milk;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class MILKLIstener implements Listener {

    @EventHandler
    public void onItemConsume(PlayerItemConsumeEvent event){
        if(event.getItem().getType().equals(Material.MILK_BUCKET)){
            event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel()+Milk.plugin.getConfig().getInt("Food-Amount"));

            //event.getPlayer().sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Before:" + event.getPlayer().getSaturation());
            event.getPlayer().setSaturation(event.getPlayer().getSaturation()+Milk.plugin.getConfig().getInt("Saturation-Amount"));
           // event.getPlayer().sendMessage(ChatColor.GRAY + "[MILK]" + ChatColor.DARK_GRAY + " Value set!"  + event.getPlayer().getSaturation());
        }

    }

}
