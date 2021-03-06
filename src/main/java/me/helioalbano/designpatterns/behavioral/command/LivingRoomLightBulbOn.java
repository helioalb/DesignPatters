package me.helioalbano.designpatterns.behavioral.command;

import me.helioalbano.designpatterns.behavioral.command.house.LightBulb;
import me.helioalbano.designpatterns.behavioral.command.house.LivingRoomLightBulb;

public class LivingRoomLightBulbOn implements Command {

	private final LightBulb lightBulb = new LivingRoomLightBulb();
	
	@Override
	public String execute() {
		return this.lightBulb.on();
	}
}
