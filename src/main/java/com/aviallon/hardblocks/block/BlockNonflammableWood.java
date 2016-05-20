package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.creativetab.CreativeTabHB;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class BlockNonflammableWood extends BlockHB {
    public BlockNonflammableWood(){
        super(Material.wood);
        this.setBlockName("nonflammableWood");
        this.setHardness(3);
        this.setResistance(10);
        this.setHarvestLevel("axe", 1);
        this.setCreativeTab(CreativeTabHB.HB_TAB);
    }
    public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
        return 0;
    }
}