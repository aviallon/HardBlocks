package com.aviallon.hardblocks;

import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.proxy.IProxy;
import com.aviallon.hardblocks.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version=Reference.VERSION)
public class HardBlocks {
	@Mod.Instance("HardBlocks")
	public static HardBlocks instance;
	
	@SidedProxy(clientSide = "com.aviallon.hardblocks.proxy.ClientProxy", serverSide = "com.aviallon.hardblocks.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		//FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
