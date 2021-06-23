
/**
 * //A class for enemy design and encounters with those enemies, more specifically for the main
 * enemy (boss?) of act one. **WORK IN PROGRESS**
 * 
 * @author Andrew A. Krupp
 *
 */
public class EnemyForActOne extends Enemy {

  /**
   * This constructor sends itself to the superclasses default empty parameter constructor to set
   * default values.
   */
  public EnemyForActOne() {
    super();
  }

  /**
   * This overloaded constructor sends its data to the superclass overloaded constructor to set the
   * fields.
   * 
   * @param hp amount to set health at.
   * @param dif level to set difficulty at.
   * @param enemyName name to set.
   */
  public EnemyForActOne(double hp, int dif, String enemyName) {
    super(hp, dif, enemyName);

  }

  /**
   * This method was created specifically to be an example of overriding; it overrides the method in
   * the superclass to do its own thing.
   *
   * @return returns the value in the string variable initialized in the method itself.
   */
  public String encounterDialougue() {
    String speech = "Hello, I am demonstrating polymorphism";
    return speech;
  }

}
