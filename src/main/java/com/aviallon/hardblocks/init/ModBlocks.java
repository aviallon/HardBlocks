package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.block.BlockHardenedRock;
import com.aviallon.hardblocks.block.BlockNonflammableWood;
import com.aviallon.hardblocks.block.BlockReinforcedRock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block hardenedRock;
    public static Block nonflammableWood;
    public static Block reinforcedRock;

    public static void init() {
        hardenedRock = new BlockHardenedRock();
        nonflammableWood = new BlockNonflammableWood();
        reinforcedRock = new BlockReinforcedRock();
    }

    public static void register() {
        registerBlock(hardenedRock);
        registerBlock(nonflammableWood);
        registerBlock(reinforcedRock);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);

        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        registerRenders(hardenedRock);
        registerRenders(nonflammableWood);
        registerRenders(reinforcedRock);
    }

    private static void registerRenders(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(),"inventory"));
    }
}
