import java.util.Scanner;


public class ACSL1 {
	public static void main (String[] args) {
		//System.out.println(2%3);
		//System.out.println(Integer.valueOf(6/4));
		go();
	}

	private static void go() {
		String toPrint = "";
		String currentLetter = "A";
		int numToMove = 0;
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
					//will github work?
				


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
		// TODO Auto-generated method stub
		return 0;
	}


}
