package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayerCreation() {
		Player player = new Player(1, "TDDTestPlayer");

		assertNotNull("Player instance should not be null.", player);
		assertEquals(1, player.getId());
		assertEquals("TDDTestPlayer", player.getName());
	}

}
