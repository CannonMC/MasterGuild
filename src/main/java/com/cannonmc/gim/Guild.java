package com.cannonmc.gim;

import com.cannonmc.gim.commands.IdleCommand;
import com.cannonmc.gim.util.ChatMonitor;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Guild.MODID, version = Guild.VERSION, acceptedMinecraftVersions = "[1.8.9]")
public class Guild {
	public static final String MODID = "gim";
	public static final String VERSION = "1.0";

	public static boolean ENABLED = false;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ClientCommandHandler.instance.registerCommand(new IdleCommand());
		MinecraftForge.EVENT_BUS.register((Object)new ChatMonitor());
	}
}
