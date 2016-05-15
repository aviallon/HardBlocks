package com.aviallon.hardblocks.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModBlocks.hardenedRock), "sss", "sis", "sss", 's', new ItemStack(Blocks.cobblestone), 'i', new ItemStack(Items.iron_ingot));
    }
}
