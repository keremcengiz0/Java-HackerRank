package JavaHackerRank.ValidUsernameRegularExp;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		String usernameRegex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
		String username;

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++) {
			username = input.nextLine();
			if (username.matches(usernameRegex)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}

	}

}
