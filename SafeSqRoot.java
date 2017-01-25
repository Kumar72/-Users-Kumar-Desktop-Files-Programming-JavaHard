package Exercises;

import java.util.Scanner;

public class SafeSqRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String reply;	//study drills

		System.out.print("Are you ready?");
		reply = keyboard.next();
		
		while (!reply.equals("Yes")) {
			System.out.print("Are you ready?");
			reply = keyboard.next();
		}


		System.out.print("Give me a number, and I'll find it's square root.");
		System.out.print("(No negatives, please): ");
		x = keyboard.nextDouble();

		while (x < 0) { 	//protection loop
			System.out.println("I won't take take the square root of a negative number.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();

		}
		y = Math.sqrt(x);
		System.out.println("The square root of "+x+" is "+y);
	}
}
