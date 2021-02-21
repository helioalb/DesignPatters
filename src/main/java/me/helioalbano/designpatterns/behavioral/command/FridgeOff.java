package me.helioalbano.designpatterns.behavioral.command;

import me.helioalbano.designpatterns.behavioral.command.house.Geladeira;

public class FridgeOff implements Command {

	private final Geladeira fridge = new Geladeira();
	
	@Override
	public String execute() {
		return fridge.desliga();
	}
}
