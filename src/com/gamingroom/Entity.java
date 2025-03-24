package com.gamingroom;

/**
 * Abstract base class representing a general entity with an ID and name. This
 * class is extended by Game, Team, and Player.
 * 
 * @author richardgoshen
 */

public abstract class Entity {
	protected long id;
	protected String name;

	/**
	 * Protected constructor to be called by subclasses only.
	 *
	 * @param id   the unique ID of the entity
	 * @param name the name of the entity
	 */
	protected Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Returns the unique identifier of the entity.
	 *
	 * @return the ID of the entity
	 */
	public long getId() {
		return id;
	}

	/**
	 * Returns the name of the entity.
	 *
	 * @return the name of the entity
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns a string representation of the entity.
	 *
	 * @return a formatted string with class name, ID, and name
	 */
	@Override
	public String toString() {
		return String.format("%s [id=%d, name=%s]", this.getClass().getSimpleName(), id, name);
	}

}
