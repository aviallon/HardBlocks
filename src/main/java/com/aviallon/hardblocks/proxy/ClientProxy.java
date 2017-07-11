package com.aviallon.hardblocks.proxy;


import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.init.ModItems;

public class ClientProxy implements CommonProxy {

    @Override
    public void init(){
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
