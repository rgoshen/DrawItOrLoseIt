package com.gamingroom;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {

	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		System.out.println("=== Running Unit Tests ===");

		runTestSuite(GameServiceTest.class);
		runTestSuite(GameTest.class);
		runTestSuite(EntityToStringTest.class);
		runTestSuite(SingletonTester.class);

		System.out.println("=== Application Output ===");

		// Obtain reference to the singleton instance
		GameService service = GameService.getInstance();

		System.out.println("\nAbout to test initializing game data...");

		Game game = service.addGame("DemoGame");
		System.out.println(game);

		Team team = game.addTeam("DemoTeam");
		System.out.println(team);

		Player player = team.addPlayer("DemoPlayer");
		System.out.println(player);
	}

	/**
	 * Runs a test class and prints pass/fail results for each test.
	 */
	private static void runTestSuite(Class<?> testClass) {
		System.out.println("\n-- Running tests from: " + testClass.getSimpleName());
		Result result = JUnitCore.runClasses(testClass);

		if (result.wasSuccessful()) {
			result.getRunCount();
			result.getFailures().forEach(failure -> {
				System.out.println("Test failed: " + failure.getTestHeader());
				System.out.println("Reason: " + failure.getMessage());
			});
			System.out.println("✅ All tests passed.");
		} else {
			for (Failure failure : result.getFailures()) {
				System.out.println("❌ Test failed: " + failure.getTestHeader());
				System.out.println("↳ " + failure.getMessage());
			}
			System.out.printf("❌ %d/%d tests failed.\n", result.getFailureCount(), result.getRunCount());
		}
	}
}
