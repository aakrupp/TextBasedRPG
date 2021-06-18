import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Andrew A. Krupp
/* A collection of skills I learned in COP 2006 for the Java programming language
 * For this project, I will be creating a text based Role PLaying Game
 * Think Dungeons and Dragons, but in a different setting and played by yourself.
 * In this situation, I am your dungeon master. Enjoy the game!*/

/* >int: 32-bit data type for integers up to a value of around 2.2 billion 
 * 
 * >byte: 8-bit data type useful for saving memory in large arrays with a min value 
 * of -128 and a max of 127
 * 
 * >short: 16-bit data type also useful for saving memory in large arrays but with 
 * a min value of -32,768 and a max of 32,767
 * 
 * >long: a 64-bit data type with a very, very large max value that is useful when 
 * the desired value is outside of the int data types range  
 * 
 * >float: a 32-bit IEEE data type that contains decimal values
 * 
 * >double: a 64-bit IEEE data type that also contains decimals
 * 
 * >boolean: a data type with only two possible values: true (1) or false (0) 
 * 
 * >char: a 16-bit unicode data type 
 * */
/*
 * 	 Operator Precedence (from top to bottom): 
		 Postfix(++, --) 
		 Unary
		 Multiplicative
		 Additive
		 Shift
		 Relational
		 Equality
		 Bitwise AND
		 Bitwise OR
		 Logical AND
		 Logical OR
		 Ternary
		 Assignment
 */
// == is the equals operator 
//With strings, the == compares the memory addresses rather than the actual strings themselves. Thus, the == operator does not work with Strings.
// A variable is a location in memory 

// Scope is when a variable is only accessible in the method it was created (defined)
/* 
 * 	Inheritance: In Java, classes can be derived from other classes 
		Subclass: a class derived from another class
		Superclass: the class from which the subclass is derived from 
Allows for the reuse of already written code without the need to rewrite and re-debug said code
*/

/* 
 * Polymorphism: subclasses can define their own unique behaviors and yet share some of the same functionality as their parent class
 * */

public class Main {
	public static void main(String[] args) {
		double operatorExample = 0;
		System.out.println(
				"Below is a series of examples demonstrating my knowledge of things I could not naturally fit into my program at this point \n"
						+ operatorExample);
		operatorExample++;
		System.out.println(operatorExample);
		operatorExample--;
		System.out.println(operatorExample);
		operatorExample = 9 % 4;
		System.out.println(operatorExample);
		operatorExample = Math.pow(5, 2);
		System.out.println(operatorExample);
		String stringExample = "hello";
		boolean equalsMethod = stringExample.equals("Hello");
		System.out.println(equalsMethod); // should be false
		int compareToMethod = stringExample.compareTo("Hello");
		System.out.println(compareToMethod); // should be 0

		Scanner scan = new Scanner(System.in);
		boolean intArrayValidation = true;
		int numberOfQuizScores = scan.nextInt();
		int[] quizScores = new int[numberOfQuizScores];
		int largestScore = 0;
		int smallestScore = 0;
		int smallestScoreIndex = 0;
		int largestScoreIndex = 0;
		int scoreAccumulator = 0;
		do {
			try {

				for (int quizNum = 0; quizNum < quizScores.length; quizNum++) {
					System.out.println("Enter the score for quiz #" + (quizNum + 1));
					quizScores[quizNum] = scan.nextInt();
				}

				largestScore = quizScores[0];
				smallestScore = quizScores[0];
				smallestScoreIndex = 0;
				largestScoreIndex = 0;
				scoreAccumulator = quizScores[0];
				for (int quizNum = 1; quizNum < quizScores.length; quizNum++) {
					if (quizScores[quizNum] > largestScore) {
						largestScore = quizScores[quizNum];
						largestScoreIndex = quizNum;
					}
					if (quizScores[quizNum] < smallestScore) {
						smallestScore = quizScores[quizNum];
						smallestScoreIndex = quizNum;
					}
					scoreAccumulator += quizScores[quizNum];
				}

				intArrayValidation = false;

			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("Incorrect Entry. Please enter an Integer.");
			} catch (Exception e) {
				System.out.println("Unknown error. Code 69.");
			}

		} while (intArrayValidation == true);
		System.out.println("The largest score is " + largestScore + " at Index " + largestScoreIndex);
		System.out.println("The smallest score is " + smallestScore + " at Index " + smallestScoreIndex);
		System.out.println("The total of all quiz scores input is " + scoreAccumulator);

		int valueToFindInArray = 9;
		int positionOfValueRow = 0;
		int positionOfValueCol = 0;
		int twoDimArrayTotal = 0;
		int[][] twoDimArrayExample = { { 15, 12, 10 }, { 9, 10, 15 } };

		for (int[] col : twoDimArrayExample) {
			for (int currentValue : col) {
				twoDimArrayTotal += currentValue;
			}
		} // found an example of how to use an enhanced for loop with a 2D array on
			// w3schools.com
		for (int row = 0; row < twoDimArrayExample.length; row++) {
			for (int col = 0; col < twoDimArrayExample[0].length; col++) {
				if (twoDimArrayExample[row][col] == valueToFindInArray) {
					positionOfValueRow = row;
					positionOfValueCol = col;
				}
			}
		}
		System.out
				.println("The value 9 was found at row " + positionOfValueRow + ", column " + positionOfValueCol + ".");
		System.out.println("The total for the 2D array is: " + twoDimArrayTotal);

		ArrayList<String> arr = new ArrayList<String>(5);
		arr.add("Hello,");
		arr.add("this");
		arr.add("is");
		arr.add("an");
		arr.add("ArrayList.");
		System.out.println(arr);

		scan.nextLine();

		menu();
		scan.close();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		boolean menuValidation = false;
		System.out.println(
				"For a better experience, please answer the question below: \nAre you planning on playing this game for fun? (Enter 'yes' or 'no')");
		// scan.nextLine();
		String viewingReason = scan.nextLine();

		switch (viewingReason) {
		case "yes":
			System.out.println("Awesome! I hope you have a great time!");
			break;
		case "no":
			System.out.println("Then you must either be my professor or looking to recruit me for a job. "
					+ "\nWelcome! I have many comments in the code of this program to show my knowledge of Java. Email me at aakrupp1968@my.fgcu.edu if you have any quesions.");
			break;
		default:
			System.out.println("Incorrect Entry.");
		}

		System.out.println("Welcome to my Java Text-Based RPG \nTo proceed with Character Creation: press 1 \n"
				+ "To skip Character Creation and proceed directly to Act 1 of the story: press 2 (You will be provided a pre-built character)"
				+ "\nTo exit the program: Press 99");

		do {
			try {
				int userSelection = scan.nextInt();
				if (userSelection == 1) {
					characterCreation();
					menuValidation = true;
				} else if (userSelection == 2) {
					PlayerCharacter defaultCharacter = new PlayerCharacter();
					// defaultCharacter.setPlayerCharacterIsHuman(true);
					// defaultCharacter.setPlayerIntellect(4);
					// defaultCharacter.setPlayerStrength(4);
					// defaultCharacter.setPlayerEngineering(4);
					// **these lines of code are no longer necessary because of my default
					// constructor**
					actOne(defaultCharacter);
					menuValidation = true;
				} else if (userSelection == (int) 420.0) { // super useless example of casting, but nonetheless it shows
															// how
															// it works by casting the double to an int for the purpose
															// of
															// testing the input
					System.out.println("Blaze it, bro");
					continue; // In this context, the continue statement does the same thing setting my
								// menuValidation variable to false does:
					// it continues the loop

				} else if (userSelection == 69) {
					System.out.println("Nice.");
					continue;
				} else {
					System.out.println("Exiting...");
					break; // In this context, the break statement does the same thing setting my
							// menuValidation variable to true does:
					// it stops the loop and then leaves this block of code.
				}
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("Incorrect Entry. Please enter 1, 2, or 99.");
			} catch (Exception e) {
				System.out.println("Unknown error. Not sure how you got here. Code 420.");
			}
		} while (menuValidation == false);
		scan.close();
	}

	public static void characterCreation() {
		PlayerCharacter player = new PlayerCharacter();
		int startingPoints = 12;
		boolean characterCreationValidation = true;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println(
						"Hello and welcome to my game! This is RPG quest (placeholder title). An RPG Sci-fi Adventure game. Enter your name to continue: ");

				System.out.println("Please enter what you would like to name your character: ");
				final String PLAYER_CHARACTER_NAME = scanner.nextLine();
				// the final prefix to a variable makes that variable unchangeable. This is
				// useful if it is a variable that should never change.

				System.out.println(
						"Would your like your character to be human or some other race? (enter true for human, false for another fictional race");
				player.setPlayerCharacterIsHuman(scanner.nextBoolean());
				// Above is my first method call with arguments (besides the main method) in
				// this program, it sends the player input boolean as an argument to the method
				// in the PlayerCharacter Class.
				System.out.println(
						"You have a max of 12 points to allocate across three skills (max 10 per skill). \n Don't worry, you will gain more skill points later through gameplay. ");

				System.out.println("Please Select the skill level for Intellect. This will effect "
						+ PLAYER_CHARACTER_NAME + "'s ability to solve problems that require deeper thinking.");
				boolean intellectSelectionCondition = false;
				while (intellectSelectionCondition == false) {
					int playerIntellectSelection = scanner.nextInt();
					if (playerIntellectSelection > 0 && playerIntellectSelection <= 10
							&& playerIntellectSelection <= startingPoints) {
						player.setPlayerIntellect(playerIntellectSelection);
						startingPoints -= playerIntellectSelection;
						System.out.println("You now have " + startingPoints + " points remaining.");
						intellectSelectionCondition = true;
					} else {
						System.out.println(
								"Invalid Entry. You can put a maximum of 10 points into a skill, and you have 12 points to start with. "
										+ "\nPlease ensure your entry meets these constraints. ");
					}
				}

				System.out.println("Select the skill level for Strength. This will effect " + PLAYER_CHARACTER_NAME
						+ "'s ability to solve problems with brute force");
				boolean strengthSelectionCondition = false;
				while (strengthSelectionCondition == false) {
					int playerStrengthSelection = scanner.nextInt();
					if (playerStrengthSelection > 0 && playerStrengthSelection <= 10
							&& playerStrengthSelection <= startingPoints) {
						player.setPlayerStrength(playerStrengthSelection);
						startingPoints -= playerStrengthSelection;
						System.out.println("You now have " + startingPoints + " points remaining.");
						strengthSelectionCondition = true;
					} else {
						System.out.println(
								"Invalid Entry. You can put a maximum of 10 points into a skill, and you have 12 points to start with. "
										+ "\nPlease ensure your entry meets these constraints. ");
					}
				}

				System.out.println("Select the skill level for Engineering. This will effect " + PLAYER_CHARACTER_NAME
						+ "'s ability to solve problems with mechanical skill");
				boolean engineeringSelectionCondition = false;
				while (engineeringSelectionCondition == false) {
					int playerEngineeringSelection = scanner.nextInt();
					if (playerEngineeringSelection > 0 && playerEngineeringSelection <= 10
							&& playerEngineeringSelection <= startingPoints) {
						player.setPlayerEngineering(playerEngineeringSelection);
						startingPoints -= playerEngineeringSelection;
						System.out.println("You now have " + startingPoints + " points remaining.");
						engineeringSelectionCondition = true;
					} else {
						System.out.println(
								"Invalid Entry. You can put a maximum of 10 points into a skill, and you have 12 points to start with. "
										+ "\nPlease ensure your entry meets these constraints. ");
					}
					characterCreationValidation = false;
				}
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Incorrect Entry. Restarting Character Creation..."); // I know this is super lazy, I
																							// will refine it later when
																							// I'm not under a time
																							// constraint
			} catch (Exception e) {
				System.out.println("Unknown error. Code 69,420.");
			}
		} while (characterCreationValidation == true);
		scanner.close();
		actOne(player);
	}

	public static void actOne(PlayerCharacter characterUserChose) {
		// I ran into writers block, because I'm not a writer so I cannot think of a
		// story
		// So this has turned into a testing ground for my game mechanics

		// **DEVELOP A FULL ENCOUNTER HERE**
		PlayerCharacter player = characterUserChose;
		EnemyForActOne placeHolderName = new EnemyForActOne();
		System.out.println(placeHolderName.talk());
		System.out.println(placeHolderName.encounterDialougue());

		System.out.println("To test the diceroll feature in tandem with your skill choice");
		// if (player.skillCheckEngineering() == 1) {
		// System.out.println("True Pass");
		// } else {
		// System.out.println("False Fail");
		// }
		System.out.println(((player.skillCheckEngineering() == 1) ? "True Pass" : "False Fail"));

		player.moralityTrackerMethod(-2);
		player.moralityTrackerMethod(2);
	}
	// scanner.close();

}
