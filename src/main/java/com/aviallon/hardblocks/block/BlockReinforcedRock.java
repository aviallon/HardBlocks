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

public class BlockReinforcedRock extends Block {

    private float Resistance = 20f;

    public BlockReinforcedRock() {
        super(Material.ROCK);
        this.setRegistryName(Reference.HBBlocks.REINFORCEDROCK.getRegistryName());
        this.setUnlocalizedName(Reference.HBBlocks.REINFORCEDROCK.getUnlocalizedName());
        this.setHardness(4f);
        this.setResistance(Resistance);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
