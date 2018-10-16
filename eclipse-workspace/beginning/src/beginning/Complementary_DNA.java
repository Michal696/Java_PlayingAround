package beginning;

public class Complementary_DNA {

	public static String makeComplement(String dna) {
		char complementary_dna[] = dna.toCharArray();

		// going to swap A with T and C with G for whole string
		int len = dna.length();
		for (int i = 0; i < len; i++) {
			complementary_dna[i] = complementSwap(complementary_dna[i]);
		}
		return String.valueOf(complementary_dna);
	}

	// going to swap A with T and C with G
	private static char complementSwap(char c) {
		switch (c) {
		case 'A':
			c = 'T';
			break;
		case 'T':
			c = 'A';
			break;
		case 'C':
			c = 'G';
			break;
		case 'G':
			c = 'C';
			break;
		}
		return c;
	}

}
