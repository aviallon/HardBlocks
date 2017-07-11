package com.aviallon.hardblocks.creativetab;

import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab {

    public static final CreativeTabs HB_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };
}
