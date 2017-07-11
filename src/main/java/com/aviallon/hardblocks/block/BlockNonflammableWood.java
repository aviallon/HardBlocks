package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNonflammableWood extends Block {
    //private float Resistance = 20f;

    public BlockNonflammableWood() {
        super(Material.WOOD);
        this.setHardness(1f);
        this.setResistance(1f);
        this.setRegistryName(Reference.HBBlocks.NONFLAMMABLEWOOD.getRegistryName());
        this.setUnlocalizedName(Reference.HBBlocks.NONFLAMMABLEWOOD.getUnlocalizedName());
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(Blocks.PLANKS.getSoundType());
    }


    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
}
