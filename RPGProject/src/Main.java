import java.util.Scanner;

// Andrew A. Krupp
/* A collection of skills I learned in COP 2006 for the Java programming language
 * For this project, I will be creating a text based Role PLaying Game
 * Think Dungeons and Dragons, but in a different setting and played by yourself.
 * In this situation, I am your dungeon master. Enjoy the game!*/

/* >int: 32-bit data type for integers up to a value of around 2.2 billion 
 * 
 * >Byte: 8-bit data type useful for saving memory in large arrays with a min value 
 * of -128 and a max of 127
 * 
 * >Short: 16-bit data type also useful for saving memory in large arrays but with 
 * a min value of -32,768 and a max of 32,767
 * 
 * >Long: a 64-bit data type with a very, very large max value that is useful when 
 * the desired value is outside of the int data types range  
 * 
 * >Float: a 32-bit IEEE data type that contains decimal values
 * 
 * >Double: a 64-bit IEEE data type that also contains decimals
 * 
 * >Boolean: a data type with only two possible values: true (1) or false (0) 
 * 
 * >Char: a 16-bit unicode data type 
 * */

// A variable is a location in memory 

// Scope is when a variable is only accessible in the method it was created (defined)
public class Main {
	public static void main(String[] args) {
		
		PlayerCharacter player = new PlayerCharacter();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello and welcome to my game! This is RPG quest (placeholder title). An RPG Sci-fi Adventure game. Enter your name to continue: ");
		final String PLAYER_NAME = scanner.nextLine();
		System.out.println("Please enter what you would like to name your character: ");
		final String PLAYER_CHARACTER_NAME = scanner.nextLine();
		
		System.out.println("Would your like your character to be human or some other race? (enter true for human, false for another fictional race");
		player.playerCharacterIsHuman = scanner.nextBoolean();
		
		System.out.println("You have a max of 20 points to allocate across three skills (max 10 per skill)");
		System.out.println("Please Select the skill level for Intellect. This will effect " + PLAYER_CHARACTER_NAME + "'s ability to solve problems that require deeper thinking.");
		player.playerIntellect = scanner.nextInt();
		
		System.out.println("Select the skill level for Strength. This will effect " + PLAYER_CHARACTER_NAME + "'s ability to solve problems with brute force");
		player.playerStrength = scanner.nextDouble();
		
		System.out.println("Select the skill level for Engineering. This will effect " + PLAYER_CHARACTER_NAME + "'s ability to solve problems with mechanical skill");
		player.playerEngineering = scanner.nextFloat();
	}

}
