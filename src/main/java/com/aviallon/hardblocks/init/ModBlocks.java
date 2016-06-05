package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.block.BlockHardenedRock;
import com.aviallon.hardblocks.block.BlockReinforcedRock;
import com.aviallon.hardblocks.block.base.BlockHB;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<BlockHB> BLOCKS = new ArrayList<>();

    public static final BlockHB hardenedRock = new BlockHardenedRock();
    public static final BlockHB reinforcedRock = new BlockReinforcedRock();

    public static void register() {

        for (BlockHB blockHB : BLOCKS) {
            GameRegistry.register(blockHB);
            GameRegistry.register(new ItemBlock(blockHB).setRegistryName(blockHB.getRegistryName()));
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModelsAndVariants() {
        BLOCKS.forEach(BlockHB::initModelsAndVariants);
    }
}
