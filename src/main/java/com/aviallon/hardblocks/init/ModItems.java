package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.item.ItemHBPickaxe;
import com.aviallon.hardblocks.item.ItemhardenedRockPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemHBPickaxe hardenedRockPickaxe = new ItemhardenedRockPickaxe();
	//public static final ItemHB appletreeLeaf = new ItemAppletreeLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(hardenedRockPickaxe, "hardenedRockPickaxe");
		//GameRegistry.registerItem(appletreeLeaf, "appletreeLeaf");
	}
}
