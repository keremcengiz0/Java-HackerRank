package JavaHackerRank.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Map<String, String> info = new HashMap<>();

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			String name = input.nextLine();
			String phone = input.nextLine();
			info.put(name, phone);
		}

		while (input.hasNextLine()) {
			String query = input.nextLine();
			if (info.containsKey(query)) {
				System.out.println(query + "=" + info.get(query));
			} else {
				System.out.println("Not found");
			}
		}

	}

}
