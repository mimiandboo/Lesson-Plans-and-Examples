package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;

public class squeakyBall extends QuickItem {
    {
        name = "squeaky ball";
        tab = CreativeTabs.MISC;
        texture = "squeakyball";
    }

    public void onRightClick(){
        displayMessage("squeak!");
        playSound(SoundEvents.ENTITY_BAT_AMBIENT);
    }
}
