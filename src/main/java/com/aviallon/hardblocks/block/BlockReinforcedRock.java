package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.block.base.BlockHB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockReinforcedRock extends BlockHB {

    private static final String NAME = "reinforcedRock";
    private float Resistance = 20f;

    public BlockReinforcedRock() {
        super(NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return false;
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

    @Override
    public float getExplosionResistance(World p_getExplosionResistance_1_, BlockPos p_getExplosionResistance_2_, Entity p_getExplosionResistance_3_, Explosion p_getExplosionResistance_4_) {
        return this.Resistance;
    }
}
