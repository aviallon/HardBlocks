package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.block.BlockHB;
import com.aviallon.hardblocks.block.BlockHardenedRock;
import com.aviallon.hardblocks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockHB hardenedRock = new BlockHardenedRock();
	
	public static void init()
	{
		GameRegistry.registerBlock(hardenedRock, "hardenedRock");
	}
}
