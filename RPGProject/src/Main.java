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
public class Main {
	public static void main(String[] args) {
		double operatorExample = 0;
		System.out.println(
				"Below is a series of examples demonstrating my knowledge of operators and other things I could not naturally fit into my program at this point \n"
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

		for (int i = 0; i <= 5; i++) {
			System.out.println("* * * * *");
		}
		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		boolean menuValidation = false;
		System.out.println(
				"For a better experience, please answer the question below: \nAre you planning on playing this game for fun? (Enter 'yes' or 'no')");
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
				+ "\nTo exit the program: Press any other key");

		do {
			int userSelection = scan.nextInt();
			if (userSelection == 1) {
				characterCreation();
				menuValidation = true;
			} else if (userSelection == 2) {
				PlayerCharacter defaultCharacter = new PlayerCharacter();
				defaultCharacter.setPlayerCharacterIsHuman(true);
				defaultCharacter.setPlayerIntellect(4);
				defaultCharacter.setPlayerStrength(4);
				defaultCharacter.setPlayerEngineering(4);
				actOne(defaultCharacter);
				menuValidation = true;
			} else if (userSelection == (int)420.0) { // super useless example of casting, but nonetheless it shows how
														// it works by casting the double to an int for the purpose of
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
		} while (menuValidation == false);
		scan.close();
	}

	public static void characterCreation() {
		PlayerCharacter player = new PlayerCharacter();
		int startingPoints = 12;
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Hello and welcome to my game! This is RPG quest (placeholder title). An RPG Sci-fi Adventure game. Enter your name to continue: ");
		// final String PLAYER_NAME = scanner.nextLine(); Not useful, likely to be cut

		System.out.println("Please enter what you would like to name your character: ");
		final String PLAYER_CHARACTER_NAME = scanner.nextLine();
		// the final prefix to a variable makes that variable unchangeable. This is
		// useful if it is a variable that should never change.

		System.out.println(
				"Would your like your character to be human or some other race? (enter true for human, false for another fictional race");
		player.setPlayerCharacterIsHuman(scanner.nextBoolean()); // = scanner.nextBoolean();
		// Above is my first method call with arguments (besides the main method) in
		// this program, it sends the player input boolean as an argument to the method
		// in the PlayerCharacter Class.
		System.out.println(
				"You have a max of 12 points to allocate across three skills (max 10 per skill). \n Don't worry, you will gain more skill points later through gameplay. ");

		System.out.println("Please Select the skill level for Intellect. This will effect " + PLAYER_CHARACTER_NAME
				+ "'s ability to solve problems that require deeper thinking.");
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
		}
		scanner.close();
		actOne(player);
	}
	// I want to make character selection more robust

	public static void actOne(PlayerCharacter characterUserChose) {
		PlayerCharacter player = characterUserChose;
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
