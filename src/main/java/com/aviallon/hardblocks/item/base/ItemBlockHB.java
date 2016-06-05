package com.aviallon.hardblocks.item.base;

import com.google.common.base.Function;
import com.aviallon.hardblocks.block.base.BlockHB;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public abstract class ItemBlockHB extends ItemMultiTexture {

    public ItemBlockHB(BlockHB block, String ... variants) {
        super(block, block, variants);
    }

    public ItemBlockHB(BlockHB block, Function<ItemStack, String> nameFunction) {
        super(block, block, nameFunction);
    }
}
