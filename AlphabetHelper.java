import java.util.HashMap;


public class AlphabetHelper {
	HashMap<String, Integer> letterToNumber = new HashMap<String, Integer>() {{ put("A", 1); put("B", 2); put("C", 3); put("D", 4); put("E", 5); put("F", 6); put("G", 7); put("H", 8); put("I", 9); put("J", 10); put("K", 11); put("L", 12); put("M", 13); put("N", 14); put("O", 15); put("P", 16); put("Q", 17); put("R", 18); put("S", 19); put("T", 20); put("U", 21); put("V", 22); put("W", 23); put("X", 24); put("Y", 25); put("Z", 26);}};
	HashMap<Integer, String> numberToLetter = new HashMap<Integer, String>() {{ put(1, "A"); put(2, "B"); put(3, "C"); put(4, "D"); put(5, "E"); put(6, "F"); put(7, "G"); put(8, "H"); put(9, "I"); put(10, "J"); put(11, "K"); put(12, "L"); put(13,"M"); put(14, "N"); put(15, "O"); put(16, "P"); put(17, "Q"); put(18, "R"); put(19, "S"); put(20, "T"); put(21, "U"); put(22, "V"); put(23, "W"); put(24, "X"); put(25, "Y"); put(26, "Z");}};
	
	public int getNumber(String s) {
		return letterToNumber.get(s);
	}
	
	public String getLetter(int i) {
		return numberToLetter.get(i);
	}
}
