package com.idtech.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

public class customBlock extends QuickBlock{
    {
        name = "brick";
        tab = CreativeTabs.BUILDING_BLOCKS;
        texture = "brick";
        itemDropped = Items.BRICK;
    }


}
