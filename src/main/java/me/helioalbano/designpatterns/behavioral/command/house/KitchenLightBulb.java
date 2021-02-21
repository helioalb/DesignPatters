package me.helioalbano.designpatterns.behavioral.command.house;

public class KitchenLightBulb implements LightBulb {

	@Override
	public String on() {
		return "KitchenLightBulb is on";
	}

	@Override
	public String off() {
		return "KitchenLightBulb is off";
	}
}
