package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.ItemMapleLeaf;
import com.aviallon.hardblocks.item.ItemHB;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemHB mapleLeaf = new ItemMapleLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
