package com.gamingroom;

/**
 * A simple class to hold game data. Now extends Entity to share common id and
 * name behavior.
 * 
 * @author coce@snhu.edu
 */
public class Game extends Entity {

	/**
	 * Constructor with an identifier and name.
	 *
	 * @param id   the unique ID of the game
	 * @param name the name of the game
	 */
	public Game(long id, String name) {
		super(id, name);
	}

}
