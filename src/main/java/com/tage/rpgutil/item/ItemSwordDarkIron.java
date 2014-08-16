package com.tage.rpgutil.item;

import com.tage.rpgutil.reference.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.creativetab.CreativeTabs;

public class ItemSwordDarkIron extends ItemSword
{
    public ItemSwordDarkIron()
    {
        super(Item.ToolMaterial.IRON);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setNoRepair();
        this.maxStackSize = 1;
        this.setUnlocalizedName(Names.Items.DARKIRONSWORD);
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