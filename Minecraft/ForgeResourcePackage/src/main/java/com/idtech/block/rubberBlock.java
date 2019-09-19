package com.idtech.block;

import net.minecraft.creativetab.CreativeTabs;

public class rubberBlock extends QuickBlock{
    {
        name = "rubber block";
        tab = CreativeTabs.BUILDING_BLOCKS;
        texture = "rubber";
    }

    public void onEntityWalk(){
        entity.motionX += 1;
    }
}
