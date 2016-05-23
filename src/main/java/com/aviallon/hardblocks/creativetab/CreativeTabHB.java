package com.aviallon.hardblocks.creativetab;

import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.reference.Reference;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class CreativeTabHB {
    public static final CreativeTabs HB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            ItemStack iStack = new ItemStack(ModBlocks.hardenedRock);
            return iStack.getItem();
        }
    };
}