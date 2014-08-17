package com.tage.rpgutil.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.tage.rpgutil.item.*;
import com.tage.rpgutil.reference.Reference;
import com.tage.rpgutil.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ItemSword darkironSword = new ItemSwordDarkIron();
	public static final ItemSword darkrustySword = new ItemSwordRusty();
	public static final ItemSword rapierSword = new ItemSwordRapier();
	public static final ItemSword genericSword = new ItemGenericSword();
	public static final ItemSword spikedSword = new ItemSpikedDarkIron();
	public static final ItemSword netherSword = new ItemNetherSword();

    public static void init()
    {
        GameRegistry.registerItem(darkironSword, Names.Items.DARKIRONSWORD);
        GameRegistry.registerItem(darkrustySword, Names.Items.RUSTYIRONSWORD);
        GameRegistry.registerItem(rapierSword, Names.Items.RAPIERSWORD);
        GameRegistry.registerItem(genericSword, Names.Items.GENERICSWORD);
        GameRegistry.registerItem(spikedSword, Names.Items.SPIKEDSWORD);
        GameRegistry.registerItem(netherSword, Names.Items.NETHERSWORD);
    }
}