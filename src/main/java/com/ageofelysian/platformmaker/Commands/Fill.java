package com.ageofelysian.platformmaker.Commands;

import com.ageofelysian.platformmaker.Platform;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Fill implements CommandExecutor {
    private final Loc1 loc1;
    private final Loc2 loc2;

    public Fill(Loc1 loc1, Loc2 loc2) {
        this.loc1 = loc1;
        this.loc2 = loc2;
    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Platform platform= new Platform(loc1.getLoc1(), loc2.getLoc2());

        return false;
    }
}
