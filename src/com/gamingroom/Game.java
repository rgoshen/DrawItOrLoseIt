package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold game data. Now extends Entity to share common id and
 * name behavior.
 * 
 * @author coce@snhu.edu
 */
public class Game extends Entity {

	private List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name.
	 *
	 * @param id   the unique ID of the game
	 * @param name the name of the game
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * Adds a new team with a unique name to this game.
	 *
	 * @param name the name of the new team
	 * @return the newly added Team, or existing one if duplicate
	 */
	public Team addTeam(String name) {
		// Check for existing team name using iterator
		Iterator<Team> iterator = teams.iterator();
		while (iterator.hasNext()) {
			Team team = iterator.next();
			if (team.getName().equalsIgnoreCase(name)) {
				return team; // Return existing team if duplicate found
			}
		}

		// If name is unique, create and add new team
		Team team = new Team(teams.size() + 1, name); // You can update ID generation later
		teams.add(team);
		return team;
	}

	/**
	 * Retrieves a team by name.
	 *
	 * @param name the name to search for
	 * @return the matching Team or null if not found
	 */
	public Team getTeam(String name) {
		Iterator<Team> iterator = teams.iterator();
		while (iterator.hasNext()) {
			Team team = iterator.next();
			if (team.getName().equalsIgnoreCase(name)) {
				return team;
			}
		}
		return null;
	}

}
