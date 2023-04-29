package JavaHackerRank.JavaSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String firstName;
	private double cgpa;

	public Student(int id, String firstName, double cgpa) {
		this.id = id;
		this.firstName = firstName;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int id = scanner.nextInt();
			String firstName = scanner.next();
			double cgpa = scanner.nextDouble();
			students.add(new Student(id, firstName, cgpa));
		}

		List<String> result = students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed()
				.thenComparing(Student::getFirstName).thenComparing(Student::getId)).map(Student::getFirstName)
				.collect(Collectors.toList());

		for (String name : result) {
			System.out.println(name);
		}

	}

}
