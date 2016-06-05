package com.aviallon.hardblocks.item.base;

import com.aviallon.hardblocks.creativetab.CreativeTab;
import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemHB extends Item implements IItemVariantHolder<ItemHB> {

    private final String BASE_NAME;
    private final String[] VARIANTS;

    public ItemHB(String name, String ... variants) {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.HB_TAB);
        setMaxStackSize(1);
        setNoRepair();

        BASE_NAME = name;
        if (variants.length == 0) {
            VARIANTS = new String[] { "normal" };
        }
        else {
            VARIANTS = variants;
        }

        ModItems.ITEMS.add(this);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        if (hasSubtypes && itemStack.getMetadata() < VARIANTS.length) {
            return String.format("item.%s", VARIANTS[itemStack.getMetadata()]);
        }
        return super.getUnlocalizedName(itemStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTab, List<ItemStack> list) {

        if (!getHasSubtypes()) {
            super.getSubItems(item, creativeTab, list);
        }
        else {
            for (int meta = 0; meta < VARIANTS.length; ++meta) {
                list.add(new ItemStack(this, 1, meta));
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModelsAndVariants() {

        // TODO TRACE level logging
        if (getCustomMeshDefinition() != null) {

            ModelLoader.setCustomMeshDefinition(this, getCustomMeshDefinition());
            for (int i = 0; i < VARIANTS.length; i++) {
                ModelBakery.registerItemVariants(this, getCustomModelResourceLocation(VARIANTS[i]));
            }
        }
        else {
            if (!getHasSubtypes()) {
                ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
            }
            else {
                for (int i = 0; i < VARIANTS.length; i++) {
                    ModelLoader.setCustomModelResourceLocation(this, i, getCustomModelResourceLocation(VARIANTS[i]));
                }
            }
        }
    }

    @Override
    public ItemHB getItem() {
        return this;
    }

    @Override
    public String[] getVariants() {
        return VARIANTS;
    }

    @Override
    public ItemMeshDefinition getCustomMeshDefinition() {
        return null;
    }

    protected ModelResourceLocation getCustomModelResourceLocation(String variant) {
        return new ModelResourceLocation(Reference.MOD_ID + ":" + variant);
    }
}
