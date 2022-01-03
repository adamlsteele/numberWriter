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
                int hundreds = playerCount / 100;
                int tens = (playerCount - (hundreds * 100)) / 10;
                int digit = (playerCount - (tens * 10));

                Boolean[][] hundredsBlocks = numbers.getArray(hundreds);
                Boolean[][] tensBlocks = numbers.getArray(tens);
                Boolean[][] digitBlocks = numbers.getArray(digit);

                for (int z = 2; z >= 0; z--) {
                    for (int y = 4; y >= 0; y--) {
                        Location location = new Location(Bukkit.getWorld("world"), -98, 25, -19);
                        location.add(0, (-y), (-z));
                        if (digitBlocks[y][z]) {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.GREEN_TERRACOTTA);
                        } else {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.BLACK_CONCRETE);
                        }

                    }
                }
                for (int z = 2; z >= 0; z--) {
                    for (int y = 4; y >= 0; y--) {
                        Location location = new Location(Bukkit.getWorld("world"), -98, 25, -15);
                        location.add(0, (-y), (-z));
                        if (tensBlocks[y][z]) {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.GREEN_TERRACOTTA);
                        } else {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.BLACK_CONCRETE);
                        }

                    }
                }
                for (int z = 2; z >= 0; z--) {
                    for (int y = 4; y >= 0; y--) {
                        Location location = new Location(Bukkit.getWorld("world"), -98, 25, -11);
                        location.add(0, (-y), (-z));
                        if (hundredsBlocks[y][z]) {
                            Bukkit.getWorld("world").getBlockAt(location).setType(Material.GREEN_TERRACOTTA);
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
