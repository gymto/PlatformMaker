package com.ageofelysian.platformmaker;

import com.ageofelysian.platformmaker.Commands.Fill;
import com.ageofelysian.platformmaker.Commands.Loc1;
import com.ageofelysian.platformmaker.Commands.Loc2;
import com.ageofelysian.platformmaker.Commands.platformcommand;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlatformMaker extends JavaPlugin {



    @Override
    public void onEnable() {
        Loc1 locat1= new Loc1();
        Loc2 locat2= new Loc2();
        getCommand("platform").setExecutor(new platformcommand());
        getCommand("Loc1").setExecutor(locat1);
        getCommand("Loc2").setExecutor(locat2);
        getCommand("Fill").setExecutor(new Fill(locat1,locat2));



    }


    private Location loc1;
    private Location loc2;

    public Location getLoc1() {
        return loc1;
    }

    public Location getLoc2() {
        return loc2;
    }
    private Object locat1;

    private Object locat2;

    public Object getLocat1() {
        return locat1;
    }

    public Object getLocat2() {
        return locat2;
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
