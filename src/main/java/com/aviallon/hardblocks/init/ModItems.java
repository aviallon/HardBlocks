package com.aviallon.hardblocks.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItems {

    //public static Item hardenedRock;

    public static void init() {
        //hardenedRock = new ItemHardenedRock();
    }

    public static void register() {
        //GameRegistry.register(hardenedRock);
    }

    public static void registerRenders() {
        //registerRenders(hardenedRock);
    }

    private static void registerRenders(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }

}
