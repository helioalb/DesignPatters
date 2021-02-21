package me.helioalbano.designpatterns.behavioral.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivingRoomLightBulbOnTest {

	@Test
	void test() {
		assertEquals("LivingRoomLightBulb is on", new LivingRoomLightBulbOn().execute());
	}

}
