package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.item.ItemMapleLeaf;
import com.aviallon.hardblocks.item.ItemAppletreeLeaf;
import com.aviallon.hardblocks.item.ItemHB;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final ItemHB mapleLeaf = new ItemMapleLeaf();
	public static final ItemHB appletreeLeaf = new ItemAppletreeLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
		GameRegistry.registerItem(appletreeLeaf, "appletreeLeaf");
	}
}
