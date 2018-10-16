package beginning.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import beginning.Fight;
import beginning.Fighter;

class TestFight {

	@Test
	void test() {
		assertEquals("draw",
				Fight.declareWinner(new Fighter("firstFighter", 15, 5), new Fighter("secondFighter", 20, 4)));
		assertEquals("firstFighter",
				Fight.declareWinner(new Fighter("firstFighter", 15, 20), new Fighter("secondFighter", 20, 0)));
		assertEquals("secondFighter",
				Fight.declareWinner(new Fighter("firstFighter", 15, 5), new Fighter("secondFighter", 20, 20)));
//		fail("Not yet implemented");
	}

}
