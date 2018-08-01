package com.cannonmc.gim.util;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import com.cannonmc.gim.Guild;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatMonitor {

	public Minecraft mc;
	public String unformattedMessage;

	@SubscribeEvent
	public void onChat(final ClientChatReceivedEvent event) throws InterruptedException {
		unformattedMessage = event.message.getFormattedText();
		unformattedMessage = EnumChatFormatting.getTextWithoutFormattingCodes(unformattedMessage);
		System.out.println("System msg:" + unformattedMessage);

		if (unformattedMessage.equals("Gates opening in 1 second!")) {
			if (Guild.ENABLED) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Game started"));
			}
		}
		
		if (unformattedMessage.equals("WHATEVER THE END MESSAGE IS")) {
			if (Guild.ENABLED) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Game started"));
				Minecraft.getMinecraft().thePlayer.sendChatMessage("/play mw_standard");
			}
		}
	}

}