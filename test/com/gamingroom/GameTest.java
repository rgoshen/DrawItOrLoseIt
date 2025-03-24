package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	@Before
	public void setUp() {
		game = new Game(1, "TestGame");
	}

	@Test
	public void testAddTeam_UniqueName() {
		Team team = game.addTeam("Alpha");

		assertNotNull("Team should not be null when added with a unique name.", team);
		assertEquals("Alpha", team.getName());
	}

	@Test
	public void testAddTeam_DuplicateName() {
		Team first = game.addTeam("Bravo");
		Team duplicate = game.addTeam("Bravo");

		assertNotNull("First team creation should not return null.", first);
		assertNotNull("Duplicate call should return an existing team, not null.", duplicate);
		assertSame("Should return the same instance for duplicate name.", first, duplicate);
	}

	@Test
	public void testGetTeam_ExistingName() {
		game.addTeam("Charlie");
		Team found = game.getTeam("Charlie");

		assertNotNull("Expected to find a team after adding it.", found);
		assertEquals("Charlie", found.getName());
	}

	@Test
	public void testGetTeam_NonExistingName() {
		Team result = game.getTeam("Ghost");

		assertNull("Expected null when team name does not exist.", result);
	}

}
