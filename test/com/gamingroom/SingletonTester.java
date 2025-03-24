package com.gamingroom;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	@Test
	public void testSingletonInstanceIsSame() {
		GameService instance1 = GameService.getInstance();
		GameService instance2 = GameService.getInstance();

		assertNotNull("First instance should not be null", instance1);
		assertNotNull("Second instance should not be null", instance2);
		assertSame("Both instances should be the same object", instance1, instance2);
	}

}
