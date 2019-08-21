package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class teleportationRod extends QuickItem{
    {
        name = "teleport rod";
        tab = CreativeTabs.TOOLS;
        texture = "teleportrod";
    }

    public void onRightClick(){
        BlockPos block = findBlockAtCursor(200);
        moveToBlock(block);
    }

}
