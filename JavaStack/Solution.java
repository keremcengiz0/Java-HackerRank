package JavaHackerRank.JavaStack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.peek();

				if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String a = input.next();
			System.out.println(isValid(a));
		}

	}
}
