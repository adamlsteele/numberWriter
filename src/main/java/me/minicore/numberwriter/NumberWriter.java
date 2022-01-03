package me.minicore.numberwriter;

import me.minicore.numberwriter.numbers.Numbers;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public final class NumberWriter extends JavaPlugin {
    Numbers numbers;

    @Override
    public void onEnable() {
        numbers = new Numbers();

        BukkitTask updateLetters = new BukkitRunnable(){
            @Override
            public void run() {
                int playerCount = Bukkit.getOnlinePlayers().size();
                Boolean[][] blocks = numbers.getArray(playerCount);

                Bukkit.broadcastMessage("Player count: " + playerCount);

                for(int z = 2; z >= 0; z--) {
                    for(int y = 4; y >= 0; y--) {
                        Location location = new Location(Bukkit.getWorld("world"), -98, 25, -11);
                       location.add(0,(- y),(- z));
                         if(blocks[y][z]) {
                            Bukkit.broadcastMessage("true");
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.GREEN_CONCRETE);
                        } else {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.BLACK_CONCRETE);
                        }

                    }
                }
            }
        }.runTaskTimer(this, 0, 20);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
