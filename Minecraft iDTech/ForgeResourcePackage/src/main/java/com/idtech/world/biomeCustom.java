package com.idtech.world;

import com.idtech.block.QuickBlock;
import com.idtech.block.customBlock;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class biomeCustom extends Biome {
    public biomeCustom(Biome.BiomeProperties properties){
        super(properties);
        this.fillerBlock = QuickBlock.getBlock("brick").getDefaultState();
    }


}
