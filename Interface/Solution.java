package JavaHackerRank.Interface;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int total = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				total += i;
			}
		}
		return total;
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		MyCalculator myCalculator = new MyCalculator();
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getSimpleName());
		System.out.println(myCalculator.divisor_sum(n));

	}

}
