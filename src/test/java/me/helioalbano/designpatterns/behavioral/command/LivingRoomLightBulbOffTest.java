package me.helioalbano.designpatterns.behavioral.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivingRoomLightBulbOffTest {

	@Test
	void test() {
		assertEquals("LivingRoomLightBulb is off", new LivingRoomLightBulbOff().execute());
	}

}
