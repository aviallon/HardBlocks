package com.aviallon.hardblocks.creativetab;

import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab {

    public static final CreativeTabs HB_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Items.iron_ingot;
        }
    };
}
