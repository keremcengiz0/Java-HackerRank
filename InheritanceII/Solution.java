package JavaHackerRank.InheritanceII;

class Arithmetic {
	int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {
}

public class Solution {

	public static void main(String[] args) {
		Adder adder = new Adder();

		System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
		System.out.println(adder.add(42, 0) + " " + adder.add(10, 3) + " " + adder.add(5, 15));
	}
}