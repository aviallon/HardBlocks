package com.aviallon.hardblocks.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hardenedRock, 4), "sss", "sis", "sss", 's', "cobblestone", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hardenedRockPickaxe, 1), "hhh", " s ", " s ", 'h', ModBlocks.hardenedRock, 'i', "stick"));
    }
}
