package JavaHackerRank.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Result {

	public static String findDay(int month, int day, int year) {

		LocalDate localDate = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		String day1 = dayOfWeek.toString();
		return day1;

	}

}

public class Solution {

	public static void main(String[] args) {
		int month, day, year;
		Scanner input = new Scanner(System.in);

		month = input.nextInt();
		day = input.nextInt();
		year = input.nextInt();

		System.out.println(Result.findDay(month, day, year));

	}

}
