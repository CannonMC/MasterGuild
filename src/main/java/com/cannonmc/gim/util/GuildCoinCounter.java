package com.cannonmc.gim.util;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class GuildCoinCounter {
	
	public static int prevCoins = 0;
	public static int nowCoins = 0;
	
	public static void getGuildCoin(String unformattedMessage) {
		int subs = unformattedMessage.indexOf("Guild") - 1;
		String guildCoinsS = unformattedMessage.substring(10, subs);
		int guildCoins = Integer.parseInt(guildCoinsS.replaceAll("\\s+",""));
		System.out.println(guildCoins);
		prevCoins = nowCoins;
		nowCoins = guildCoins;
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(Integer.toString(nowCoins-prevCoins) + " guild coins earned."));
	}

}