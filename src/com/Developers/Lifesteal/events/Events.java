package com.Developers.Lifesteal.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import static org.bukkit.Bukkit.getServer;

public class Events implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("§5 Welcome to §c§lLifeSteal SMP");


    }



}
