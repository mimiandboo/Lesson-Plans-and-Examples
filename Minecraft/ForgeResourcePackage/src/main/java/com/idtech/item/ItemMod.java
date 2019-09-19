package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemMod {

	// Material
	public static Item.ToolMaterial GEL;

	// Tools
	public static itemPickaxe itemGelPickaxe;

	public static void preInit(){

		// Materials
		GEL = EnumHelper.addToolMaterial("GEL", 3,
				100, 4, 50, 0);

		// Tools
		itemGelPickaxe = new itemPickaxe();


	}

	public static void init(){

		// Register Item Renderers
		BaseMod.proxy.registerItemInventoryRender(itemGelPickaxe,
				itemGelPickaxe.name);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		// Register Items
		event.getRegistry().register(itemGelPickaxe.setRegistryName(
				itemGelPickaxe.name
		));
	}
}

