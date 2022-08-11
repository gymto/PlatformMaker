package com.ageofelysian.platformmaker.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Loc2 implements CommandExecutor {

    public Location getLoc2() {
        return loc2;
    }

    private Location loc2;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player){
            Player p =(Player) sender;
            loc2 = p.getLocation();

        }



        return true;
    }
}
