package com.cannonmc.gim.util;

import net.minecraft.client.Minecraft;

public class CommandSend {
	
	public static void joinMegawalls() {
		Minecraft.getMinecraft().thePlayer.sendChatMessage("/play mw_standard");
	}
	
	public static void gInfo() {
		Minecraft.getMinecraft().thePlayer.sendChatMessage("/g info");
	}

}
