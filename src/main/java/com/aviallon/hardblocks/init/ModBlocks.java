package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.block.BlockHB;
import com.aviallon.hardblocks.block.BlockHardenedRock;
import com.aviallon.hardblocks.block.BlockNonflammableWood;
import com.aviallon.hardblocks.block.BlockReinforcedRock;
import com.aviallon.hardblocks.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockHB hardenedRock = new BlockHardenedRock();
	public static final BlockHB reinforcedRock = new BlockReinforcedRock();
	public static final BlockHB nonflammableWood = new BlockNonflammableWood();

	public static void init()
	{
		GameRegistry.registerBlock(hardenedRock, "hardenedRock");
		GameRegistry.registerBlock(reinforcedRock, "reinforcedRock");
		GameRegistry.registerBlock(nonflammableWood, "nonflammableWood");
		OreDictionary.registerOre("plankWood", new ItemStack(nonflammableWood, 1, WILDCARD_VALUE));
	}
}
