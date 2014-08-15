package com.tage.rpgutil.init;

import com.tage.rpgutil.item.ItemRPGU;
import com.tage.rpgutil.item.ItemLeaf;
import com.tage.rpgutil.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemRPGU mapleLeaf = new ItemLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}