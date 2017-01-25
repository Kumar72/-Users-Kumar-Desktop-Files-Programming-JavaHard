package Exercises;

import java.util.Scanner;

public class RunningTotal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int current, total = 0;

		System.out.print("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop when ou type a zero");


		do {
			System.out.print("Value: ");
			current = keyboard.nextInt();
			if (current !=0) {
				total += current;
				System.out.println("The total so far is: "+total);
			}
			else {
				System.out.println("The final total is: "+total);
			}
		}
		while (current != 0);

		
/*
		current = 1;
		while (current != 0) {
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;
			System.out.println("The total so far is: "+total);
		}
		System.out.println("The final total is: "+total);
*/

	}
}
