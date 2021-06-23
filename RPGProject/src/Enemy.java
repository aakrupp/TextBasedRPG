/**
 * A class for enemy design and encounters with those enemies.
 * 
 * @author Andrew A. Krupp
 *
 */
public class Enemy {
  /**
   * The health field will determine how many hit points an enemy will have.
   */
  private double health;
  /**
   * The difficulty field will determine the enemy's level in comparison to the characters level.
   */
  private int difficulty;
  /**
   * The name field will determine the enemy's name in the encounter.
   */
  private String name;
  // Overall, this isn't very interesting enemy design. Do some research and come
  // up with ideas

  /**
   * This constructor will send default values to the overloaded constructor.
   */
  public Enemy() {
    this(10, 1, "not named");
  }

  /**
   * This overloaded constructor takes values sent through the parameters and sets the fields.
   * 
   * @param hp the value for the health to set.
   * @param dif the value for the difficulty to set.
   * @param enemyName the value for the name to set.
   * 
   */
  public Enemy(double hp, int dif, String enemyName) {
    health = hp;
    difficulty = dif;
    name = enemyName;
  }

  /**
   * This method was specifically created to demonstrate inheritance but, in the future I may edit
   * it to be used in the actual game.
   * 
   * @return returns the string set in the method itself.
   * 
   */
  public String talk() {
    String response = "Hello, I am demonstrating inheritance";
    return response;
  }

  /**
   * This method was designed specifically to demonstrate polymorphism but, in the future I may edit
   * it to be used in the actual game.
   * 
   * @return returns the value in the string variable initialized in the method itself.
   */
  public String encounterDialougue() {
    String speech = "";
    return speech;
  }

  /**
   * This method exists to allow the ability to separately set the value in the health field.
   * 
   * @param healthToSet the value sent to the method to set the health field.
   */
  public void setHealth(double healthToSet) {
    health = healthToSet;
  }

  /**
   * This method exists to allow the ability to separately set the value in the difficulty field.
   * 
   * @param difficultyToSet the value sent to the method to set the difficulty field.
   */
  public void setDifficulty(int difficultyToSet) {
    difficulty = difficultyToSet;
  }

  /**
   * This method exists to allow the ability to separately set the value in the name field.
   * 
   * @param nameToSet the value sent to the method to set the name field.
   */
  public void setName(String nameToSet) {
    name = nameToSet;
  }

  /**
   * This method returns data in the specified field.
   * 
   * @return returns the value in the health field.
   */
  public double getHealth() {
    return health;
  }

  /**
   * This method returns data in the specified field.
   * 
   * @return returns the value in the difficulty field.
   */
  public int getDifficulty() {
    return difficulty;
  }

  /**
   * This method returns data in the specified field.
   * 
   * @return returns the value in the name field.
   */
  public String getName() {
    return name;
  }
}
