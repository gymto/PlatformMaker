package com.ageofelysian.platformmaker;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Platform {


    private int x1;
    private int x2;
    private int z1;
    private int z2;
    private int y1;
    private int y2;

    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private int startZ;
    private Location loc1;

    public Location getLoc1() {
        return loc1;
    }

    public Location getLoc2() {
        return loc2;
    }

    private Location loc2;

    public int getStartX() {
        return startX;
    }

    public int getEndX() {
        return endX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndY() {
        return endY;
    }

    public int getStartZ() {
        return startZ;
    }

    public int getEndZ() {
        return endZ;
    }

    private int endZ;

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getZ1() {
        return z1;
    }

    public int getZ2() {
        return z2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public Platform(Location loc1, Location loc2) {
        x1 = loc1.getBlockX();
        x2 = loc2.getBlockX();
        z1 = loc1.getBlockZ();
        z2 = loc2.getBlockZ();
        y1 = loc1.getBlockY();
        y2 = loc2.getBlockY();
        if (x1 > x2) {
            startX = x2;
            endX = x1;
        } else {
            startX = x1;
            endX = x2;


        }
        if (z1 > z2) {
            startZ = (int) z2;
            endZ = z1;
        } else {
            startZ = z1;
            endZ = (int) z2;


        }
        if (y1 > y2) {
            startY = y2;
            endY = y1;
        } else {
            startY = y1;
            endY = y2;


        }

    }

    private void fillBlocks() {
        World world = loc1.getWorld();
        for (int x = startX; x <= endX; x++) {
            for (int z = startZ; z <= endZ; z++) {
                for (int y = startY; y <= endY; y++) {
                    world.getBlockAt(x, y, z).setType(Material.GLASS);

                }
            }
        }
    }
}