package com.gmail.kurumitk78.milk;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class MILKLIStener implements Listener {

    @EventHandler
    public void onItemConsume(PlayerItemConsumeEvent event){
        if(event.getItem().getType().equals(Material.MILK_BUCKET)){
            event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel()+Milk.plugin.getConfig().getInt("Food-Amount")); //set player food level

            event.getPlayer().setSaturation(event.getPlayer().getSaturation()+Milk.plugin.getConfig().getInt("Saturation-Amount")); //set player saturation value
        }

    }

}
