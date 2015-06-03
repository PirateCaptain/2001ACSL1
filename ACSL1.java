import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class ACSL1 {
	public static void main (String[] args) {
		//System.out.println(2%3);
		//System.out.println(Integer.valueOf(6/4));
		go();
	}

	private static void go() {
		//declarations:
		String toPrint = "";
		String currentLetter = "A";
		int numToMove = 0;
		HashMap<String, Integer> lettersToNumbers = new HashMap<String, Integer>() {{ put("A", 1); put("B", 2); put("C", 3); put("D", 4); put("E", 5); put("F", 6); put("G", 7); put("H", 8); put("I", 9); put("J", 10); put("K", 11); put("L", 12); put("M", 13); put("N", 14); put("O", 15); put("P", 16); put("Q", 17); put("R", 18); put("S", 19); put("T", 20); put("U", 21); put("V", 22); put("W", 23); put("X", 24); put("Y", 25); put("Z", 26);}};

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] data = s.split("");
		for (int i = 0; i<data.length; i+=2) {
			if (data[i].equals("$")) {//print output and reset for next line
				System.out.println(toPrint);
				toPrint = "";
				currentLetter = "A";
			}
			else {
				String st = data[i];
				int in = Integer.valueOf(data[i+1]);
				switch (in) {
				case 1:	numToMove = rule1(st);
					break;
				case 2: numToMove = rule2(st);
					break;
				case 3: numToMove = rule3(st);
					break;
				case 4: numToMove = rule4(st);
					break;
				case 5: numToMove = rule5(st);
					break;
				case 6: numToMove = rule6(st);
					break;
				}
			}
		}
	}

	private static int rule6(String st) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule5(String st) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule4(String st) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule3(String st) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule2(String st) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule1(String st) {
		
		return 0;
	}


}
