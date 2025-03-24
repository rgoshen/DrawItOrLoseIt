package com.gamingroom;

/**
 * Abstract superclass for entities that share a unique ID and name. This is
 * extended by Game, Team, and Player classes.
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
	 * Returns the ID of the entity.
	 *
	 * @return the ID value
	 */
	public long getId() {
		return id;
	}

	/**
	 * Returns the name of the entity.
	 *
	 * @return the name value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns a string representation of the entity.
	 *
	 * @return formatted string with ID and name
	 */
	@Override
	public String toString() {
		return String.format("%s [id=%d, name=%s]", this.getClass().getSimpleName(), id, name);
	}

}
