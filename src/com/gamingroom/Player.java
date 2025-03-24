package com.gamingroom;

/**
 * A class to represent a player in the game. Extends Entity to inherit common
 * id and name properties.
 * 
 * @author coce@snhu.edu
 */
public class Player extends Entity {

	/**
	 * Constructs a new Player with a unique ID and name.
	 *
	 * @param id   the unique ID of the player
	 * @param name the name of the player
	 */
	public Player(long id, String name) {
		super(id, name);
	}
}
