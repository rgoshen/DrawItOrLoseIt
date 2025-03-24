package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

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
	public void testAddGame_UniqueName() {
		String gameName = "UniqueGame";
		Game game = gameService.addGame(gameName);

		assertNotNull("Game should not be null when added with a unique name.", game);
		assertEquals("Game name should match input name.", gameName, game.getName());
	}

	@Test
	public void testAddGame_DuplicateName() {
		String name = "DuplicateGame";
		Game first = gameService.addGame(name);
		Game second = gameService.addGame(name);

		assertNotNull("First game creation should not return null.", first);
		assertNotNull("Second call should return an existing game, not null.", second);
		assertEquals("Game names should match.", first.getName(), second.getName());
		assertSame("Duplicate call should return the same game instance.", first, second);
	}
}
