package com.aviallon.hardblocks.proxy;

import com.aviallon.hardblocks.handler.ConfigurationHandler;
import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.handler.CraftingHandler;
import com.aviallon.hardblocks.init.ModItems;
import net.minecraftforge.fml.common.event.*;

public abstract class CommonProxy implements IProxy {

    @Override
    public ClientProxy getClientProxy() {
        return null;
    }

    @Override
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.register();
        ModBlocks.register();
    }

    @Override
    public void onInit(FMLInitializationEvent event) {
        CraftingHandler.init();
    }

    @Override
    public void onPostInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void onServerStopping(FMLServerStoppingEvent event) {

    }
}
