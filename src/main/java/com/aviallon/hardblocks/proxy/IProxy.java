package com.aviallon.hardblocks.proxy;

import net.minecraftforge.fml.common.event.*;

public interface IProxy {

    ClientProxy getClientProxy();

    void onPreInit(FMLPreInitializationEvent event);

    void onInit(FMLInitializationEvent event);

    void onPostInit(FMLPostInitializationEvent event);

    void onServerStarting(FMLServerStartingEvent event);

    void onServerStopping(FMLServerStoppingEvent event);
}
