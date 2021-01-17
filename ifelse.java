package Project3;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		System.out.println("Enter your age : ");
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		if(input > 18)
			System.out.println("You are eligible to vote");
		else if(input > 20)
			System.out.println("You are a Major");
		else
			System.out.println("You a NOT eligible to vote");
		
		

	}

}
