package JavaHackerRank.JavaStringsIntroduction;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String A = input.nextLine();
		String B = input.nextLine();
		
		System.out.println(A.length()+B.length());
		
		if(A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1,B.length()) );
	}

}
