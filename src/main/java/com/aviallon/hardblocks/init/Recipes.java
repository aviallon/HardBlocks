package com.aviallon.hardblocks.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.hardenedRock, 4), "sss", "sis", "sss", 's', "cobblestone", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.reinforcedRock, 4), "rrr", "rdr", "rrr", 'r', "stone", 'd', "gemDiamond"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.reinforcedRock, 4), "sis", "iwi", "sis", 's', ModBlocks.hardenedRock, 'w', "logWood", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hardenedRockPickaxe, 1), "hhh", " s ", " s ", 'h', ModBlocks.hardenedRock, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.nonflammableWood, 2), "plankWood", "plankWood", Items.blaze_powder));
    }
}