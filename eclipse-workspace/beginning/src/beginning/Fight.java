package beginning;

public class Fight {
	public static String declareWinner(Fighter firstFighter, Fighter secondFighter) {
		String nameOfWinner = "draw";
		int countOfRoundsForFirstFighter = calculateCountOfRounds(firstFighter, secondFighter);
		int countOfRoundsForSecondFighter = calculateCountOfRounds(secondFighter, firstFighter);
		if (countOfRoundsForFirstFighter > countOfRoundsForSecondFighter) {			
			nameOfWinner = firstFighter.getName();
		}
		if (countOfRoundsForFirstFighter < countOfRoundsForSecondFighter) {			
			nameOfWinner = secondFighter.getName();
		}

		return nameOfWinner;
	}
	
	private static int calculateCountOfRounds(Fighter firstFighter, Fighter secondFighter) {
		if (secondFighter.getDamagePerAttack() == 0) {
			return Integer.MAX_VALUE;
		}
		if (firstFighter.getHp() % secondFighter.getDamagePerAttack() == 0) {
			return firstFighter.getHp() / secondFighter.getDamagePerAttack();
		}else {
			return firstFighter.getHp() / secondFighter.getDamagePerAttack() + 1;
		}
			
	}
}
