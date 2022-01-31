package com.Developers.Lifesteal;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import static org.bukkit.Bukkit.getServer;


public class Lifesteal extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is disabled");
    }

}
