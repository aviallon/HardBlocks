package com.aviallon.hardblocks;

import com.aviallon.hardblocks.init.ModBlocks;
import com.aviallon.hardblocks.init.ModItems;
import com.aviallon.hardblocks.init.ModRecipes;
import com.aviallon.hardblocks.proxy.CommonProxy;
import com.aviallon.hardblocks.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES)
public class HardBlocks {

    @Instance(Reference.MOD_ID)
    public static HardBlocks instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //ModItems.init();
        //ModItems.register();

        ModBlocks.init();
        ModBlocks.register();
    }


    @EventHandler
    public void Init(FMLInitializationEvent event){

        proxy.init();
        //GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
        //NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new MergerGuiHandler());
        //GameRegistry.registerTileEntity(TileMergerFurnace.class, Reference.VanillaPlusBroBlocks.MERGER.getUnlocalizedName());
        ModRecipes.register();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
