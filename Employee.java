package Employee;

import java.util.Scanner;

public class Employee {
	String name;
	int year_of_joining;
	String address;

	public void getInput() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Employee Name: ");
		name = in.next();
		System.out.println("Enter the year of joining: ");
		year_of_joining = in.nextInt();
		System.out.println("Enter the address of the employee: ");
		address = in.next();
	}


