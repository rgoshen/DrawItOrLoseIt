/**
 * 
 */
package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Team class.
 */
public class TeamTest {

	private Team team;

	@Before
	public void setUp() {
		team = new Team(1, "TestTeam");
	}

	@Test
	public void testAddPlayerUniqueName() {
		Player player = team.addPlayer("PlayerOne");

		assertNotNull("Player should not be null when added with a unique name.", player);
		assertEquals("PlayerOne", player.getName());
	}

	@Test
	public void testAddPlayerDuplicateName() {
		Player first = team.addPlayer("DuplicatePlayer");
		Player second = team.addPlayer("DuplicatePlayer");

		assertNotNull("First player creation should not return null.", first);
		assertNotNull("Second call should return an existing player, not null.", second);
		assertEquals("Player names should match.", first.getName(), second.getName());
		assertSame("Should return the same instance for duplicate name.", first, second);

		assertEquals("Only one player should exist after duplicate adds.", 1, team.getPlayerCount());
	}

	@Test
	public void testGetPlayerExistingName() {
		team.addPlayer("RetrieveMe");
		Player found = team.getPlayer("RetrieveMe");

		assertNotNull("Expected to find a player after being added.", found);
		assertEquals("RetrieveMe", found.getName());
	}

}
