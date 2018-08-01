package com.cannonmc.gim.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class TimeJump {
	
	public static boolean jumped = false;
	final static int keyJump = Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode();
	
	public static void check() {
		if (java.time.LocalTime.now().getMinute() % 5 == 0 && jumped == false) {
			KeyBinding.setKeyBindState(keyJump, true);
			jumped = true;
		}else if (java.time.LocalTime.now().getMinute() % 6 == 0 && jumped == true) {
			jumped = false;
		}
		
		if(jumped == true) {
			KeyBinding.setKeyBindState(keyJump, false);
		}
	}
	
}
