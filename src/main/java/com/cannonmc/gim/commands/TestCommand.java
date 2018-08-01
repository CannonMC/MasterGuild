package com.cannonmc.gim.commands;

import com.cannonmc.gim.Guild;
import com.cannonmc.gim.util.ChatMonitor;
import com.cannonmc.gim.util.Join;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class TestCommand extends CommandBase {

	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}

	@Override
	public String getCommandName() {
		return "testcommand";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/testcommand";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		ChatMonitor.MWStarted = true;
	}

}
