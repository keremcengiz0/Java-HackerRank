package JavaHackerRank.CurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		/* 
		 * It works in Java 7.
		 */
		
		
		Scanner input = new Scanner(System.in);
		double payment = input.nextDouble();
		input.close();
		
		Locale INDIA = new Locale("en", "IN");
	
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
		
		
	}

}
