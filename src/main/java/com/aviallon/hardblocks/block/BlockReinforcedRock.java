package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.creativetab.CreativeTabHB;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class BlockReinforcedRock extends BlockHB {
    public BlockReinforcedRock(){
        super();
        this.setBlockName("reinforcedRock");
        this.setHardness(10);
        this.setResistance(40);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(CreativeTabHB.HB_TAB);
    }
}