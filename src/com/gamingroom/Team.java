package com.gamingroom;

/**
 * A class to hold information about a team. Extends Entity to inherit common id
 * and name functionality.
 * 
 * @author coce@snhu.edu
 */
public class Team extends Entity {
	/**
	 * Constructor with an identifier and name.
	 *
	 * @param id   the unique ID of the team
	 * @param name the name of the team
	 */
	public Team(long id, String name) {
		super(id, name);
	}
}
