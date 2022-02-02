package com.Developers.Lifesteal;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.bukkit.Bukkit.getServer;


public class Lifesteal extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is enabled");

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

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is disabled");
    }

}
