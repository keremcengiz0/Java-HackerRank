package JavaHackerRank.PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			String pattern = input.nextLine();
			try {
				Pattern patternToCheck = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}

	}

}
