package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumParticleTypes;

public class healingMug extends QuickItem {
    {
        name = "healing mug";
        tab = CreativeTabs.MISC;
        texture = "mug";
    }

    public void onRightClick(){
        player.heal(10);
        spawnParticles(player, EnumParticleTypes.HEART, 1);
    }
}
