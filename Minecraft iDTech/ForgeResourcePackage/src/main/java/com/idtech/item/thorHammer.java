package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;

public class thorHammer extends QuickItem{
    {
        name = "lightning hammer";
        tab = CreativeTabs.TOOLS;
        texture = "lightninghammer";
    }

    public void onRightClick(){
        BlockPos block = findBlockAtCursor(20);
        createLightningBolt(block);

        float explosionSize = 20;
        boolean destroyBlocks = true;
        createExplosion(block, explosionSize, destroyBlocks);
    }
}
