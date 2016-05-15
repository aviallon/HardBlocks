package com.aviallon.hardblocks;

import com.aviallon.hardblocks.handler.ConfigurationHandler;
import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.init.Recipes;
import com.aviallon.hardblocks.proxy.IProxy;
import com.aviallon.hardblocks.reference.Reference;
import com.aviallon.hardblocks.utility.LogHelper;
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
		LogHelper.info("Welcome to Hardblocks :) Thanks for using this mod.");
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		LogHelper.info("Post Initialization Complete!");
	}
}
