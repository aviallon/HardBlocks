package com.aviallon.hardblocks.util;

import com.aviallon.hardblocks.reference.Key;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public interface IKeyBound {

    void doKeyBindingAction(EntityPlayer entityPlayer, ItemStack itemStack, Key key);
}
