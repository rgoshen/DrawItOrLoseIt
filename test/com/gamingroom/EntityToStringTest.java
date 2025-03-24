package com.gamingroom;

import static org.junit.Assert.assertTrue;

/**
 * Tests for toString() methods across Entity subclasses.
 */
import org.junit.Test;

public class EntityToStringTest {

	@Test
	public void testGameToString() {
		Game game = new Game(1, "TestGame");
		String output = game.toString();
		assertTrue("Game toString should include class name and ID.", output.contains("Game [id=1"));
		assertTrue("Game toString should include the name.", output.contains("TestGame"));
	}

	@Test
	public void testTeamToString() {
		Team team = new Team(2, "TestTeam");
		String output = team.toString();
		assertTrue("Team toString should include class name and ID.", output.contains("Team [id=2"));
		assertTrue("Team toString should include the name.", output.contains("TestTeam"));
	}

	@Test
	public void testPlayerToString() {
		Player player = new Player(3, "TestPlayer");
		String output = player.toString();
		assertTrue("Player toString should include class name and ID.", output.contains("Player [id=3"));
		assertTrue("Player toString should include the name.", output.contains("TestPlayer"));
	}

}
