package beginning;

public class Fighter {
	private String name;
	private int hp;
	private int damagePerAttack;

	public Fighter(String name, int hp, int damagePerAttack) {
		this.name = name;
		this.hp = hp;
		this.damagePerAttack = damagePerAttack;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getDamagePerAttack() {
		return this.damagePerAttack;
	}

}
