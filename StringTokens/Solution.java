package JavaHackerRank.StringTokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void checkToken(String sentence) {
		sentence = sentence.replaceAll("[.,'!?_@]", " ");
		String[] splittedSentence = sentence.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(splittedSentence));

		list.removeIf(str -> str.equals(""));

		System.out.println(list.size());

		for (String l : list) {
			System.out.println(l);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		checkToken(sentence);
	}

}
