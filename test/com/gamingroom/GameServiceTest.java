package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for GameService to verify unique name functionality.
 */
public class GameServiceTest {

	private GameService gameService;

	@Before
	public void setUp() {
		gameService = GameService.getInstance();
		gameService.clear(); // Reset state for isolated tests
	}

	@Test
	public void testAddGameUniqueName() {
		String gameName = "UniqueGame";
		Game game = gameService.addGame(gameName);

		assertNotNull("Game should not be null when added with a unique name.", game);
		assertEquals("Game name should match input name.", gameName, game.getName());
	}

	@Test
	public void testAddGameDuplicateName() {
		String name = "DuplicateGame";
		Game first = gameService.addGame(name);
		Game second = gameService.addGame(name);

		assertNotNull("First game creation should not return null.", first);
		assertNotNull("Second call should return an existing game, not null.", second);
		assertEquals("Game names should match.", first.getName(), second.getName());
		assertSame("Duplicate call should return the same game instance.", first, second);
	}

	@Test
	public void testGetGameExistingName() {
		String name = "ExistingGame";
		gameService.addGame(name);

		Game found = gameService.getGame(name);

		assertNotNull("Game should be found by name after being added.", found);
		assertEquals("Game name should match the requested name.", name, found.getName());
	}

	@Test
	public void testGetGameNonExistingName() {
		Game result = gameService.getGame("ThisGameDoesNotExist");

		assertNull("Expected null when requesting a non-existing game name.", result);
	}

	@Test
	public void testGetGameById() {
		Game created = gameService.addGame("FindByIdGame");
		long id = created.getId();

		Game found = gameService.getGame(id);

		assertNotNull("Expected to find game by valid ID.", found);
		assertEquals("Returned game should have matching ID.", id, found.getId());
		assertEquals("Returned game should have the same name.", "FindByIdGame", found.getName());
	}

	@Test
	public void testGetNextTeamIdIncrementsCorrectly() {
		long firstId = gameService.getNextTeamId();
		long secondId = gameService.getNextTeamId();

		assertTrue("Second ID should be greater than first.", secondId > firstId);
		assertEquals("IDs should increment by 1.", 1, secondId - firstId);
	}

}
