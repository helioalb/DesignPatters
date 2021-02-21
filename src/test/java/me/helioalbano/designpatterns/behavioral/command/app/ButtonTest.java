package me.helioalbano.designpatterns.behavioral.command.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import me.helioalbano.designpatterns.behavioral.command.FridgeOff;
import me.helioalbano.designpatterns.behavioral.command.FridgeOn;
import me.helioalbano.designpatterns.behavioral.command.LivingRoomLightBulbOff;
import me.helioalbano.designpatterns.behavioral.command.LivingRoomLightBulbOn;

class ButtonTest {

	@Test
	void testLivingRoomLightBulbOn() {
		Button btn = new Button("Turn on living room light bulb", new LivingRoomLightBulbOn());
		
		assertEquals("Button Turn on living room light bulb was clicked. LivingRoomLightBulb is on", btn.click());
	}

	@Test
	void testLivingRoomLightBulbOff() {
		Button btn = new Button("Turn off living room light bulb", new LivingRoomLightBulbOff());
		
		assertEquals("Button Turn off living room light bulb was clicked. LivingRoomLightBulb is off", btn.click());
	}
	
	@Test
	void testFridgeOn() {
		Button btn = new Button("Starts fridge", new FridgeOn());
		
		assertEquals("Button Starts fridge was clicked. Geladeira ligada", btn.click());
	}
	
	@Test
	void testFridgeOff() {
		Button btn = new Button("Stop fridge", new FridgeOff());
		
		assertEquals("Button Stop fridge was clicked. Geladeira desligada", btn.click());
	}
}
