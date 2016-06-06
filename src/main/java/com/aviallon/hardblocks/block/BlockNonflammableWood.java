package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.block.base.BlockHB;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class BlockNonflammableWood extends BlockHB {

    private static final String NAME = "nonflammableWood";
    //private float Resistance = 20f;

    public BlockNonflammableWood() {
        super(NAME, Material.wood);
        this.setHardness(1f);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public boolean isBlockNormalCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    /*@Override
    public float getExplosionResistance(World p_getExplosionResistance_1_, BlockPos p_getExplosionResistance_2_, Entity p_getExplosionResistance_3_, Explosion p_getExplosionResistance_4_) {
        return this.Resistance;
    }*/

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }

    /*@Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> ret = new java.util.ArrayList<ItemStack>();

        Random rand = world instanceof World ? ((World)world).rand : RANDOM;

        int count = quantityDropped(state, fortune, rand);
        for(int i = 0; i < count; i++)
        {
            Item item = this.getItemDropped(state, rand, fortune);
            if (item != null)
            {
                ret.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
            ret.add(new ItemStack(Blocks.wooden_slab));
        }
        return ret;
    }*/

    /*@Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return 10;
    }*/
}
