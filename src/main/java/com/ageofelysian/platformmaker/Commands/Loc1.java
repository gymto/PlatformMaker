package com.ageofelysian.platformmaker.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Loc1 implements CommandExecutor {
    public Loc1(){

    }

    public Location getLoc1() {
        return loc1;
    }

    private Location loc1;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            loc1= p.getLocation();

        }


        return true;
    }
}
