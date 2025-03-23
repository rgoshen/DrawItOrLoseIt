package com.gamingroom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameServiceTest {
	private GameService gameService;

	@Before
	public void setUp() {
		gameService = new GameService();
	}

	@Test
	public void testAddGame_UniqueName() {
		Game game = new Game("UniqueGame");
		assertTrue(gameService.addGame(game));
	}

	@Test
	public void testAddGame_DuplicateName() {
		Game game1 = new Game("DuplicateGame");
		Game game2 = new Game("DuplicateGame");
		gameService.addGame(game1);
		assertFalse(gameService.addGame(game2));
	}

	@Test
	public void testGetGame_ExistingName() {
		Game game = new Game("ExistingGame");
		gameService.addGame(game);
		assertNotNull(gameService.getGame("ExistingGame"));
	}

	@Test
	public void testGetGame_NonExistingName() {
		assertNull(gameService.getGame("NonExistingGame"));
	}
}

}
