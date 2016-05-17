package com.aviallon.hardblocks.item;

import com.aviallon.hardblocks.creativetab.CreativeTabHB;
import com.aviallon.hardblocks.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemHBPickaxe extends ItemPickaxe {
	public ItemHBPickaxe(ToolMaterial material){
		super(material);
        this.setCreativeTab(CreativeTabHB.HB_TAB);
		//this.maxStackSize = 1;
		//this.setCreativeTab();
		//this.setNoRepair();
	}

    public ItemHBPickaxe(){
        this(ToolMaterial.WOOD);
    }
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
