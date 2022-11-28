package JavaHackerRank.JavaRegex;

import java.util.Scanner;

class MyRegex {
	String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = number + "." + number + "." + number + "." + number;
}

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String IP = input.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}

}
