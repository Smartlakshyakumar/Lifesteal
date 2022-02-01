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

        try{
            File myObj = new File("players.txt");
                if (myObj.createNewFile()) {
                    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "File Created" + myObj.getName());
                }

                else {
                    System.out.println("File already exists.");
                    }

            FileWriter myWriter = new FileWriter("players.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.write("\nyep it works");
            myWriter.close();
            getServer().getConsoleSender().sendMessage("Successfully wrote to the file.");
            }

            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }



}
