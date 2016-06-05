package com.aviallon.hardblocks.handler;

import com.aviallon.hardblocks.init.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHandler {

    public static void init() {

        CraftingManager.getInstance().addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hardenedRock, 4), "sss", "sss", "sss", 's', "cobblestone"));
    }
}
