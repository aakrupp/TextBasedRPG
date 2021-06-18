
//Andrew A. Krupp
import java.util.Random;

public class PlayerCharacter {
	private boolean playerCharacterIsHuman;
	private int playerIntellect;
	private int playerStrength;
	private int playerEngineering;
	protected static int hiddenPlayerMoralityTracker = 0;
	// make all private, move player name to this class
	// add more fields, more are needed for the complete experience
	/*
	 * the above stats will be used in random dicerolls to effect the outcome of
	 * certain actions the user will take part in. Each stat effects the chances of
	 * good/bad outcomes
	 */
	// Here I have created variables for the player's character as they play the
	// game.

	public PlayerCharacter() {
		this(true, 4, 4, 4);
	}

	public PlayerCharacter(boolean isHuman, int intellectToSet, int strengthToSet, int engineeringToSet) {
		playerCharacterIsHuman = isHuman;
		playerIntellect = intellectToSet;
		playerStrength = strengthToSet;
		playerEngineering = engineeringToSet;
	}

	public void setPlayerCharacterIsHuman(boolean isHuman) {
		playerCharacterIsHuman = isHuman;
	}

// Below is one of my set methods, the header is the entire first line while the parameter is the intellect in the parentheses 
	public void setPlayerIntellect(int intellect) {
		// I may have to pass the scanner object into the setters so I can ask for
		// another input when invalid input is given
		if (intellect >= 8 && intellect <= 10) {
			playerIntellect = 2;
		} else if (intellect >= 6 && intellect <= 7) {
			playerIntellect = 3;
		} else if (intellect >= 4 && intellect <= 5) {
			playerIntellect = 4;
		} else if (intellect >= 2 && intellect <= 3) {
			playerIntellect = 5;
		} else if (intellect == 1) {
			playerIntellect = 6;
		} else {
			System.out.println("Invalid entry. Please pick an integer between 1 and 10");
		}
	}

	public void setPlayerStrength(int strength) {
		if (strength >= 8 && strength <= 10) {
			playerStrength = 2;
		} else if (strength >= 6 && strength <= 7) {
			playerStrength = 3;
		} else if (strength >= 4 && strength <= 5) {
			playerStrength = 4;
		} else if (strength >= 2 && strength <= 3) {
			playerStrength = 5;
		} else if (strength == 1) {
			playerStrength = 6;
		} else {
			System.out.println("Incorrect entry. Please pick an integer between 1 and 10");
		}
	}

	public void setPlayerEngineering(int engineering) {
		if (engineering >= 8 && engineering <= 10) {
			playerEngineering = 2;
		} else if (engineering >= 6 && engineering <= 7) {
			playerEngineering = 3;
		} else if (engineering >= 4 && engineering <= 5) {
			playerEngineering = 4;
		} else if (engineering >= 2 && engineering <= 3) {
			playerEngineering = 5;
		} else if (engineering == 1) {
			playerEngineering = 6;
		} else {
			System.out.println("Incorrect entry. Please pick an integer between 1 and 10");
		}
	}

	public boolean getPlayerCharacterIsHuman() {
		return playerCharacterIsHuman;
	}

	public int getPlayerIntellect() {
		return playerIntellect;
	}

	public int getPlayerStrength() {
		return playerStrength;
	}

	public int getPlayerEngineering() {
		return playerEngineering;
	}

	public void moralityTrackerMethod(int amountToChangeMorality) {
		hiddenPlayerMoralityTracker += amountToChangeMorality;
		System.out.println("Your Morality is now: " + hiddenPlayerMoralityTracker);
	}

	Random diceRoll = new Random();

	public int skillCheckEngineering() {
		int skillCheck = 1 + diceRoll.nextInt(6);
		System.out.println("You rolled a " + skillCheck);
		if (skillCheck >= playerEngineering) {
			return 1;
		} else {
			return 0;
		}
	}

	public int skillCheckStrength() {
		int skillCheck = 1 + diceRoll.nextInt(6);
		System.out.println("You rolled a " + skillCheck);
		if (skillCheck >= playerStrength) {
			return 1;
		} else {
			return 0;
		}
	}

	public int skillCheckIntellect() {
		int skillCheck = 1 + diceRoll.nextInt(6);
		System.out.println("You rolled a " + skillCheck);
		if (skillCheck >= playerIntellect) {
			return 1;
		} else {
			return 0;
		}
	}
}
