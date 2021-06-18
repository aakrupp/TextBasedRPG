// Andrew A. Krupp
public class EnemyForActOne extends Enemy {

	public EnemyForActOne() {
		super();
	}

	public EnemyForActOne(double hp, int dif, String enemyName) {
		super(hp, dif, enemyName);

	}

	public String encounterDialougue() {
		String speech = "Hello, I am demonstrating polymorphism";
		return speech;
	}

}
