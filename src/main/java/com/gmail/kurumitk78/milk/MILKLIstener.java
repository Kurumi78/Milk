package com.gmail.kurumitk78.milk;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class MILKLIstener implements Listener {

    @EventHandler
    public void onItemConsume(PlayerItemConsumeEvent event){
        if(event.getItem().getType().equals(Material.MILK_BUCKET)){
            event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel()+Milk.plugin.getConfig().getInt("Food-Amount"));
        }

    }

}
