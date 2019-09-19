package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class itemPickaxe extends ItemPickaxe {
    public static final String name = "GelPickaxe";

    protected itemPickaxe(){
        super(ItemMod.GEL);

        this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
