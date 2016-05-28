package com.aviallon.hardblocks;

import com.aviallon.hardblocks.client.handler.KeyInputEventHandler;
import com.aviallon.hardblocks.handler.ConfigurationHandler;
import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.init.Recipes;
import com.aviallon.hardblocks.proxy.IProxy;
import com.aviallon.hardblocks.reference.Reference;
import com.aviallon.hardblocks.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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

		proxy.registerKeyBindings();

		ModItems.init();

		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Initialization Complete!");
	}
	public static String prependModID(String name) {return Reference.MOD_ID + ":" + name;}
}
