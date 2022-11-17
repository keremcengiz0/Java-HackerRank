package JavaHackerRank.JavaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n, d, sayi, q, satir, eleman;

		List<List<Integer>> numberArrays = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		n = input.nextInt();

		for (int i = 0; i < n; i++) {
			List<Integer> number = new ArrayList<>();
			d = input.nextInt();

			for (int k = 0; k < d; k++) {
				sayi = input.nextInt();
				number.add(sayi);
			}

			numberArrays.add(number);

		}

		List<List<Integer>> getNumberArrays = new ArrayList<>();
		q = input.nextInt();

		for (int i = 0; i < q; i++) {
			List<Integer> getNumber = new ArrayList<>();
			satir = input.nextInt();
			eleman = input.nextInt();
			getNumber.add(satir);
			getNumber.add(eleman);
			getNumberArrays.add(getNumber);
		}

		for (List<Integer> a : getNumberArrays) {
			Integer row = a.get(0);
			Integer column = a.get(1);

			try {
				Integer value = numberArrays.get(row - 1).get(column - 1);
				System.out.println(value);
			} catch (Exception e) {

				System.out.println("ERROR!");
			}

		}

	}

}
