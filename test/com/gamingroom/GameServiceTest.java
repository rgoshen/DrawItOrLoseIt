package com.gamingroom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
}
