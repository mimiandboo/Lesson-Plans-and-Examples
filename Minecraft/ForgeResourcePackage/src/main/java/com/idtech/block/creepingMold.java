package com.idtech.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class creepingMold extends QuickBlock{
    {
        name = "creeping mold";
        tab = CreativeTabs.BUILDING_BLOCKS;
        texture = "creepingmold";
        setTickRandomly(true);
    }

    public void onRandomTick(){
        BlockPos neighbor = findNeighborBlock();
        cloneAt(neighbor);
    }
}
