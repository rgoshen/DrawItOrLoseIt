/**
 * 
 */
package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

}
