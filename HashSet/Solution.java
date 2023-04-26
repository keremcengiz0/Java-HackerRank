package JavaHackerRank.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		String[] pair_left = new String[n];
		String[] pair_right = new String[n];

		for (int i = 0; i < n; i++) {
			pair_left[i] = input.next();
			pair_right[i] = input.next();
		}

		input.close();

		for (int i = 0; i<n; i++) {
			names.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(names.size());
		}
	}

}
