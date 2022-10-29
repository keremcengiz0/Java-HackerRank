package JavaHackerRank.StaticInitializerBlock;

import java.util.Scanner;

public class Solution {

	static int B;
	static int H;
	static boolean isValid = true;

	static {
		Scanner input = new Scanner(System.in);
		B = input.nextInt();
		H = input.nextInt();

		try {

			if (B <= 0 || H <= 0) {
				isValid = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		if (isValid) {
			int area = B * H;
			System.out.println(area);
		}

	}

}
