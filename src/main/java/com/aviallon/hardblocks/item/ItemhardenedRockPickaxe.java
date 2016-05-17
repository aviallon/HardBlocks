package com.aviallon.hardblocks.item;

import com.aviallon.hardblocks.creativetab.CreativeTabHB;
import net.minecraftforge.common.util.EnumHelper;

public class ItemhardenedRockPickaxe extends ItemHBPickaxe {

	public static ToolMaterial HARDENED_ROCK_PICKAXE = EnumHelper.addToolMaterial("HARDENED_ROCK_PICKAXE", 2, 1000, 4.0F, 1.0F, 10);

	public ItemhardenedRockPickaxe(ToolMaterial material){
		super(material);
		this.setUnlocalizedName("hardenedRockPickaxe");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabHB.HB_TAB);
	}

	public ItemhardenedRockPickaxe(){
		this(HARDENED_ROCK_PICKAXE);
	}
	
}