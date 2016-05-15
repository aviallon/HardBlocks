package com.aviallon.hardblocks.creativetab;

import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class CreativeTabHB {
    public static final CreativeTabs HB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}