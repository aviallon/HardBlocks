package com.aviallon.hardblocks.block;

import com.aviallon.hardblocks.creativetab.CreativeTabHB;
import com.aviallon.hardblocks.handler.ConfigurationHandler;

/**
 * Created by antoineviallon on 15/05/2016.
 */
public class BlockHardenedRock extends BlockHB {
    public BlockHardenedRock(){
        super();
        this.setBlockName("hardenedRock");
        this.setHardness(5);
        this.setResistance(20);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabHB.HB_TAB);
    }
}