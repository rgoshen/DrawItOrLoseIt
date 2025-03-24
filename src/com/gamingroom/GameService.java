package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;

	// Singleton instance
	private static GameService instance;

	// Private constructor to prevent instantiation
	private GameService() {
	}

	// Public method to get the singleton instance
	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
		}
		return instance;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// Iterate through existing games
		for (Game g : games) {
			if (g.getName().equalsIgnoreCase(name)) {
				return g; // Return existing game
			}
		}

		// If no match is found, create a new game
		Game game = new Game(nextGameId++, name);
		games.add(game);

		// return the new game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * 
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to find game by ID
		for (Game g : games) {
			if (g.getId() == id) {
				game = g; // Assign found instance to local variable
				break; // Stop searching once found
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to find game by name
		for (Game g : games) {
			if (g.getName().equalsIgnoreCase(name)) {
				game = g; // Assign found instance to local variable
				break; // Stop searching once found
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	/**
	 * Returns the next available team ID.
	 *
	 * @return the next team ID
	 */
	public long getNextTeamId() {
		return ++nextTeamId;
	}

	/**
	 * Returns the next available player ID.
	 *
	 * @return the next player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}

	/**
	 * Clears all games and resets ID counter.
	 * <p>
	 * This is intended for testing purposes only to ensure a clean state between
	 * test cases.
	 */
	void clear() {
		games.clear();
		nextGameId = 1;
	}
}
