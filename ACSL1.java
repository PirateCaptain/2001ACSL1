import java.util.Arrays;
import java.util.Scanner;


public class ACSL1 {
	public static void main (String[] args) {
		//System.out.println(2%3);
		//System.out.println(Integer.valueOf(6/4));
		go();
	}

	private static void go() {
		//declarations:
		String toPrint = "";
		int currentLetterValue = 1;
		int numToMove = 0;
		AlphabetHelper aHelper = new AlphabetHelper();

		Scanner scan = new Scanner(System.in);
		while(true){ 
			String s = scan.next();

			String[] data = s.split("");
			//System.err.println(Arrays.toString(data));
			for (int i = 1; i<data.length; i+=2) {
				if (data[i].equals("$")) {//print output and reset for next line
					System.out.println(toPrint);
					toPrint = "";
					currentLetterValue = 1;
					break;
				}
				else {
					String st = data[i];
					int in = Integer.valueOf(data[i+1]);
					switch (in) {
					case 1:	numToMove = rule1(st, aHelper);
					//System.err.println(numToMove);
					break;
					case 2: numToMove = rule2(st, aHelper);
					//System.err.println(numToMove);
					break;
					case 3: numToMove = rule3(st, aHelper);
					//System.err.println("case 3 called: " + numToMove);
					//System.err.println(-8%26);
					break;
					case 4: numToMove = rule4(st, aHelper);
					break;
					case 5: numToMove = rule5(st, aHelper);
					break;
					case 6: numToMove = rule6(st, aHelper);
					break;
					}
				}
				String letter = travel(numToMove%26, currentLetterValue, aHelper);
				toPrint += letter;
				currentLetterValue = aHelper.getNumber(letter);
				//toPrint += travel(numToMove%26, currentLetterValue, aHelper);
				//currentLetterValue =
			}
		}
	}

	private static String travel(int numToMove, int currentLetterValue, AlphabetHelper aHelper) {
		//System.err.println("numToMove: " +numToMove + " currentLetterValue: " + currentLetterValue);
		if (numToMove >= 0) {
			int distToEnd = 26 - currentLetterValue;
			if (distToEnd >= numToMove) {
				return aHelper.getLetter(currentLetterValue+numToMove);
			}
			else {
				return aHelper.getLetter(numToMove-distToEnd);
			}
		}
		else {
			//System.err.println("negative motion loop");
			int distToStart = currentLetterValue;
			if (distToStart >= numToMove) {
				//System.err.println("no wraparound");
				return aHelper.getLetter(currentLetterValue+numToMove);
			}
			else {
				return aHelper.getLetter(26-numToMove);
			}
		}
	}

	private static int rule6(String st, AlphabetHelper aHelper) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule5(String st, AlphabetHelper aHelper) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule4(String st, AlphabetHelper aHelper) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int rule3(String st, AlphabetHelper aHelper) {
		return Integer.valueOf(aHelper.getNumber(st)/4) * -8;
	}

	private static int rule2(String st, AlphabetHelper aHelper) {
		return (aHelper.getNumber(st)%3)*5;

	}

	private static int rule1(String st, AlphabetHelper aHelper) {
		return aHelper.getNumber(st)*2;
	}


}
