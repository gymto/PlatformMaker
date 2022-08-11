package com.ageofelysian.platformmaker.Commands;

import com.ageofelysian.platformmaker.Platform;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Fill implements CommandExecutor {
    private Location loc1;
    private Location loc2;

    public Location getLoc1() {
        return loc1;
    }

    public Location getLoc2() {
        return loc2;
    }

    public Fill(Location Loc1, Location Loc2){
        this.loc1= Loc1;
        this.loc2= Loc2;



    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Platform platform= new Platform(loc1, loc2);



        return true;
    }
}
