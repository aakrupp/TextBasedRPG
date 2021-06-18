//Andrew A. Krupp
//A class for enemy design and encounters with those enemies
public class Enemy {
	private double health;
	private int difficulty;
	private String name;
	// Overall, this isn't very interesting enemy design. Do some research and come
	// up with ideas

	public Enemy() {
		this(10, 1, "not named");
	}

	public Enemy(double hp, int dif, String enemyName) {
		health = hp;
		difficulty = dif;
		name = enemyName;
	}

	public String talk() {
		String response = "Hello, I am demonstrating inheritance";
		return response;
	}

	public String encounterDialougue() {
		String speech = "";
		return speech;
	}

	public void setHealth(double healthToSet) {
		health = healthToSet;
	}

	public void setDifficulty(int difficultyToSet) {
		difficulty = difficultyToSet;
	}

	public void setName(String nameToSet) {
		name = nameToSet;
	}

	public double getHealth() {
		return health;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public String getName() {
		return name;
	}
}
