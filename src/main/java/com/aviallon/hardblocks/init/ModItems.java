package com.aviallon.hardblocks.init;

import com.aviallon.hardblocks.item.ItemHardenedRock;
import com.aviallon.hardblocks.item.base.ItemHB;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<ItemHB> ITEMS = new ArrayList<>();

    public static final ItemHB hardenedRock = new ItemHardenedRock();

    public static void register() {
        GameRegistry.register(hardenedRock);
    }

    @SideOnly(Side.CLIENT)
    public static void initModelsAndVariants() {
        ITEMS.forEach(ItemHB::initModelsAndVariants);
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemColors() {

        for (ItemHB itemHB : ITEMS) {
            if (itemHB instanceof IItemColor) {
                FMLClientHandler.instance().getClient().getItemColors().registerItemColorHandler(new IItemColor() {
                    @Override
                    public int getColorFromItemstack(ItemStack itemStack, int tintIndex) {
                        return ((IItemColor) itemHB).getColorFromItemstack(itemStack, tintIndex);
                    }
                }, itemHB);
            }
        }
    }
}
