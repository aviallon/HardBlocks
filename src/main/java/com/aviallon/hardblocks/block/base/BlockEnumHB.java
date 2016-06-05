package com.aviallon.hardblocks.block.base;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public abstract class BlockEnumHB<T extends Enum<T> & BlockEnumHB.IEnumMeta & IStringSerializable> extends BlockHB {

    private final T[] variants;

    public BlockEnumHB(String name, Class<T> clazz) {
        this(name, Material.rock, clazz);
    }

    public BlockEnumHB(String name, Material material, Class<T> clazz) {
        super(name, material);
        this.variants = clazz.getEnumConstants();
    }

    protected abstract PropertyEnum<T> getPropertyEnum();

    protected T fromMeta(int meta) {
        if(meta < 0 || meta >= variants.length) {
            meta = 0;
        }

        return variants[meta];
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        for(T variant : variants) {
            list.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }

    public interface IEnumMeta extends IStringSerializable {

        int getMeta();

        default String getName() {
            return ((Enum) this).name().toLowerCase();
        }
    }
}
