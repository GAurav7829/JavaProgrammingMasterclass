package com.JavaProgrammingMasterclass._3ControlFlowStatements;

/**
 * 
 * new switch syntax introduced in java 14
 */
public class _01SwitchStatements_Enhanced {
	public static void main(String[] args) {
		int num = 10;

		switch (num) {
		case 10, 20, 30: // comma separated introduced in java 14
			System.out.println(num);
			break;
		case 40:
			System.out.println(num);
		default:
			System.out.println("Not in switch");
		}

		int result = getNum(num);
		System.out.println(result);

		String alpabet = getAlpabet("A");
		System.out.println(alpabet);
	}

	private static int getNum(int num) {
		// enhanced switch
		return switch (num) {
		case 10, 20, 30 -> num;
		case 40 -> num / 10;
		default -> 0;
		};
	}

	private static String getAlpabet(String alphabet) {
		return switch (alphabet) {
		case "A", "B", "C" -> alphabet.toLowerCase();
		default -> {
			// yield return a value
			// yield has to be in code block
			yield "Not in Switch";
		}
		};
	}

}
