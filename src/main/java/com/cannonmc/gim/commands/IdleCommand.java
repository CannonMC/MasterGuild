package com.cannonmc.gim.commands;

import com.cannonmc.gim.Guild;
import com.cannonmc.gim.util.CommandSend;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class IdleCommand extends CommandBase {

	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}

	@Override
	public String getCommandName() {
		return "guildidle";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/guildidle";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		Guild.ENABLED = !Guild.ENABLED;
		sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Idle: " + Boolean.toString(Guild.ENABLED)));
	}
}
