package com.aviallon.hardblocks.item.base;

import net.minecraft.client.renderer.ItemMeshDefinition;

public interface IItemVariantHolder<T extends ItemHB> {

    T getItem();

    String[] getVariants();

    ItemMeshDefinition getCustomMeshDefinition();
}
