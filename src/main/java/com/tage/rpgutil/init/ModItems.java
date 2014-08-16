package com.tage.rpgutil.init;

import net.minecraft.item.ItemSword;

import com.tage.rpgutil.item.*;
import com.tage.rpgutil.reference.Reference;
import com.tage.rpgutil.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemRPGU leaf = new ItemLeaf();
	public static final ItemSword darkironSword = new ItemSwordDarkIron();

    public static void init()
    {
        GameRegistry.registerItem(leaf, Names.Items.LEAF);
        GameRegistry.registerItem(darkironSword, Names.Items.DARKIRONSWORD);
    }
}