package JavaHackerRank.StringReverse;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String A = input.nextLine();
		String newString = "";

		for (int i = A.length() - 1; i >= 0; i--) {
			newString = newString + A.charAt(i);
		}

		if (A.equals(newString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
