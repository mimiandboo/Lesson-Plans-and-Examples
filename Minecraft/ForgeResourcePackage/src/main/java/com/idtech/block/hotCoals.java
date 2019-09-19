package com.idtech.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

public class hotCoals extends QuickBlock{
    {
        name = "hot coals";
        tab = CreativeTabs.BUILDING_BLOCKS;
        texture = "hotcoals";
        itemDropped = Items.COAL;
        setHarvestLevel(PICKAXE, WOOD);
        setHardness(10);
        setLightLevel(0.5f);
    }
}
