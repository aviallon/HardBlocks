package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockHardenedRock extends Block {

    private float Resistance = 13f;

    public BlockHardenedRock() {
        super(Material.ROCK);
        this.setRegistryName(Reference.HBBlocks.HARDENEDROCK.getRegistryName());
        this.setUnlocalizedName(Reference.HBBlocks.HARDENEDROCK.getUnlocalizedName());
        this.setHardness(3f);
        this.setResistance(Resistance);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
