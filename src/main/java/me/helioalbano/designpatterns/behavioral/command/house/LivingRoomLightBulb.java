package me.helioalbano.designpatterns.behavioral.command.house;

public class LivingRoomLightBulb implements LightBulb {

	@Override
	public String on() {
		return "LivingRoomLightBulb is on";
	}

	@Override
	public String off() {
		return "LivingRoomLightBulb is off";
	}
}
