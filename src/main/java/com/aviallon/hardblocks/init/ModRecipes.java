package com.aviallon.hardblocks.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Antoine Viallon on 11/07/2017.
 */
public class ModRecipes {
    public static void register(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedRock, 4), "sss", "sss", "sss", 's', "cobblestone");
    }
}
