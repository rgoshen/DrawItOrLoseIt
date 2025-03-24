package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A class to hold information about a team. Extends Entity to inherit common id
 * and name functionality.
 * 
 * @author coce@snhu.edu
 */
public class Team extends Entity {

	private List<Player> players = new ArrayList<Player>();

	/**
	 * Constructor with an identifier and name.
	 *
	 * @param id   the unique ID of the team
	 * @param name the name of the team
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/**
	 * Adds a new player with a unique name to this team.
	 *
	 * @param name the name of the new player
	 * @return the newly added Player, or existing one if duplicate
	 */
	public Player addPlayer(String name) {
		// Check for existing player name using iterator
		Iterator<Player> iterator = players.iterator();
		while (iterator.hasNext()) {
			Player player = iterator.next();
			if (player.getName().equalsIgnoreCase(name)) {
				return player;
			}
		}

		// If name is unique, create and add new player
		Player player = new Player((long) players.size() + 1, name); // ID management can be improved later
		players.add(player);
		return player;
	}

	/**
	 * Retrieves a player by name from this team.
	 *
	 * @param name the name to search for
	 * @return the matching Player, or null if not found
	 */
	public Player getPlayer(String name) {
		Iterator<Player> iterator = players.iterator();
		while (iterator.hasNext()) {
			Player player = iterator.next();
			if (player.getName().equalsIgnoreCase(name)) {
				return player;
			}
		}
		return null;
	}

	/**
	 * Returns the number of players currently in this team.
	 *
	 * This method is intended primarily for testing purposes, to verify that player
	 * uniqueness is enforced and no duplicates are added. It is package-private to
	 * limit visibility outside the com.gamingroom package.
	 *
	 * @return the number of players in the team
	 */
	int getPlayerCount() {
		return players.size();
	}

}
