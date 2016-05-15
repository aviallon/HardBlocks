package com.aviallon.hardblocks.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static net.minecraft.init.Blocks.obsidian;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hardenedRock), "sss", "sis", "sss", 's', "cobblestone", 'i', "ingotIron"));
    }
}
