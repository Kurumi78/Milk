package com.gmail.kurumitk78.milk;

import com.gmail.kurumitk78.milk.commands.SetFood;
import com.gmail.kurumitk78.milk.commands.SetSaturation;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;


import java.io.File;

public final class Milk extends JavaPlugin {
    public static Milk plugin;
    @Override
    public void onEnable(){
        plugin = this;
        getServer().getPluginManager().registerEvents(new MILKLIstener(), this);

        if (!(new File(this.getDataFolder(), "config.yml").exists())) { // Generates the config if missing,
            this.saveDefaultConfig();
        }
        this.getCommand("SetMilkFood").setExecutor(new SetFood());
        this.getCommand("SetMilkSaturation").setExecutor(new SetSaturation());
        int pluginId = 9165; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);
    }
}
