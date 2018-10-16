/**
 * 
 */
package beginning.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import beginning.Complementary_DNA;

/**
 * @author sajdi
 *
 */
class TestComplementary_DNA {

	@Test
	void testComplementary_DNA() {
		assertEquals("TAGC", Complementary_DNA.makeComplement("ATCG"));
		assertEquals("TAG", Complementary_DNA.makeComplement("ATC"));

//		fail("Not yet implemented");
	}

}
