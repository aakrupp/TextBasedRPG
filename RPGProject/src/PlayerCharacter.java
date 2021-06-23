import java.util.Random;

/**
 * An object class that sets and keeps track of the user's character stats, creating a character
 * object.
 * 
 * @author Andrew A. Krupp
 *
 */
public class PlayerCharacter {
  /**
   * playerCharacterIsHuman must be true (for yes, the character is human) or false.
   */
  private boolean playerCharacterIsHuman;
  /**
   * An integer value between 1-10 that determines the characters intellect skill.
   */
  private int playerIntellect;
  /**
   * An integer value between 1-10 that determines the characters strength skill.
   */
  private int playerStrength;
  /**
   * An integer value between 1-10 that determines the characters Engineering skill.
   */
  private int playerEngineering;
  /**
   * The hidden tracker of the characters morality, which will determine which ending they get at
   * the end of the game.
   */
  private int hiddenPlayerMoralityTracker = 0;
  // make all private, move player name to this class
  // add more fields, more are needed for the complete experience
  /*
   * the above stats will be used in random dicerolls to effect the outcome of certain actions the
   * user will take part in. Each stat effects the chances of good/bad outcomes
   */
  // Here I have created variables for the player's character as they play the
  // game.

  /**
   * The empty parameter constructor will send default values to the 4 parameter overloaded
   * constructor.
   */
  public PlayerCharacter() {
    this(true, 4, 4, 4);
  }

  /**
   * This constructor sets the stats for the fields rather than using the set methods below.
   * 
   * @param isHuman interacts with the playerCharacterIsHuman field
   * @param intellectToSet interacts with the playerIntellect field
   * @param strengthToSet interacts with the playerStrength field
   * @param engineeringToSet interacts with the playerEngineering field
   * 
   */
  public PlayerCharacter(boolean isHuman, int intellectToSet, int strengthToSet,
      int engineeringToSet) {
    playerCharacterIsHuman = isHuman;
    playerIntellect = intellectToSet;
    playerStrength = strengthToSet;
    playerEngineering = engineeringToSet;
  }

  /**
   * This method sets the field playerCharacterIsHuman.
   * 
   * @param isHuman interacts with the playerCharacterIsHuman field
   * 
   */
  public void setPlayerCharacterIsHuman(boolean isHuman) {
    playerCharacterIsHuman = isHuman;
  }

  // Below is one of my set methods, the header is the entire first line while the parameter is the
  // intellect in the parentheses
  /**
   * This method takes user input from main() and converts it to a number that can be used as the
   * characters odds for passing the random dice roll.
   * 
   * @param intellect Sets the player characters intellect skill based on user input or a default
   *        value.
   * 
   */
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

  /**
   * This method takes user input from main() and converts it to a number that can be used as the
   * characters odds for passing the random dice roll.
   * 
   * @param strength Sets the player characters strength skill based on user input or a default
   *        value.
   * 
   */
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

  /**
   * This method takes user input from main() and converts it to a number that can be used as the
   * characters odds for passing the random dice roll.
   * 
   * @param engineering Sets the player characters engineering skill based on user input or a
   *        default value.
   * 
   */
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

  /**
   * This method gets the value held in the private field.
   * 
   * @return returns the value being held in the playerCharacterIsHuman field.
   * 
   */
  public boolean getPlayerCharacterIsHuman() {
    return playerCharacterIsHuman;
  }

  /**
   * This method gets the value held in the private field.
   * 
   * @return returns the value held in the playerIntellect.
   * 
   */
  public int getPlayerIntellect() {
    return playerIntellect;
  }

  /**
   * This method gets the value held in the private field.
   * 
   * @return returns the value held in the playerStrength field.
   * 
   */
  public int getPlayerStrength() {
    return playerStrength;
  }

  /**
   * This method gets the value held in the private field.
   * 
   * @return returns the value held in the playerEngineering field
   * 
   */
  public int getPlayerEngineering() {
    return playerEngineering;
  }

  /**
   * This method is how the hiddenMoralityTracker field changes as needed in the program.
   * 
   * @param amountToChangeMorality the amount the method receives that will change the
   *        hiddenMoralityTracker field.
   */
  public void moralityTrackerMethod(int amountToChangeMorality) {
    hiddenPlayerMoralityTracker += amountToChangeMorality;
    System.out.println("Your Morality is now: " + hiddenPlayerMoralityTracker);
  }

  /**
   * This field holds the Random object that will be used in the below methods.
   */
  private static final Random diceRoll = new Random();

  /**
   * This method runs a random diceroll (1-6).
   * 
   * @return returns 1-6 for the number the diceroll landed on.
   * 
   */
  public int diceRollFunction() {
    int rollResult = 1 + diceRoll.nextInt(6);
    // I see this warning using spotbugs. I have researched what it means and I have decided it is
    // no real problem to my program.
    return rollResult;
  }

  /**
   * This method runs a random diceroll (1-6) and tests it against the characters stats for either a
   * fail (if below the diceroll) or a pass (if above).
   * 
   * @return returns either 1 (for pass) or 0 (for fail).
   * 
   */
  public int skillCheckEngineering() {
    int skillCheck = diceRollFunction();
    System.out.println("You rolled a " + skillCheck);
    if (skillCheck >= playerEngineering) {
      return 1;
    } else {
      return 0;
    }
  }

  /**
   * This method runs a random diceroll (1-6) and tests it against the characters stats for either a
   * fail (if below the diceroll) or a pass (if above).
   * 
   * @return returns either 1 (for pass) or 0 (for fail).
   * 
   */
  public int skillCheckStrength() {
    int skillCheck = diceRollFunction();
    System.out.println("You rolled a " + skillCheck);
    if (skillCheck >= playerStrength) {
      return 1;
    } else {
      return 0;
    }
  }

  /**
   * This method runs a random diceroll (1-6) and tests it against the characters stats for either a
   * fail (if below the diceroll) or a pass (if above).
   * 
   * @return returns either 1 (for pass) or 0 (for fail).
   * 
   */
  public int skillCheckIntellect() {
    int skillCheck = diceRollFunction();
    System.out.println("You rolled a " + skillCheck);
    if (skillCheck >= playerIntellect) {
      return 1;
    } else {
      return 0;
    }
  }
}
