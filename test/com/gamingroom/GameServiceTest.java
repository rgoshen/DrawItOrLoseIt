package com.gamingroom;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GameServiceTest {
	private GameService gameService;

	@Before
	public void setUp() {
		gameService = GameService.getInstance();
	}

	@Test
	public void testAddGame_UniqueName() {
		Game game = new Game("UniqueGame");
		assertTrue(gameService.addGame(game));
	}
}
