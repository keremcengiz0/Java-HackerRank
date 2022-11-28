package JavaHackerRank.AbstractClass;

import java.util.Scanner;

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class myBook extends Book {

	@Override
	void setTitle(String s) {
		this.title = s;
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		Book new_novel = new myBook();
		new_novel.setTitle(title);

		System.out.println("The title is: " + new_novel.getTitle());

	}
}