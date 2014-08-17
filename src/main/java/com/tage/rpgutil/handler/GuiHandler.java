package com.tage.rpgutil.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.GuiIngameForge;

public class GuiHandler extends GuiIngameForge
{
    public GuiHandler(Minecraft mc) {
		super(mc);
	}
	public static boolean renderHealth = false;
    public static boolean renderArmor = false;
}
