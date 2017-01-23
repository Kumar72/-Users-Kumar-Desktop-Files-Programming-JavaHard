package JavaHard;

import java.util.Scanner;

public class ComparingNum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print("Give me two numbers. first: ");
		first = keyboard.nextDouble();
		System.out.print("second: ");
		second =keyboard.nextDouble();

		if (first < second) {
			System.out.println(first+" is LESS THAN "+second);
		}
		if (first <= second) {
			System.out.println(first+" is LESS THAN/EQUAL TO "+second);
		}
		if (first == second) {
			System.out.println(first+" is EQUAL TO "+second);
		}
		if (first >= second) {
			System.out.println(first+" is GREATER THAN/ EQUAL TO "+second);
		}
		if (first > second) {
			System.out.println(first+" is GREATER THAN "+second);
		}
		if (first != second) 
			System.out.println(first+" is NOT EQUAL TO "+second);
		
			System.out.println("Hey"); 		//I thought this was gonna get skipped, but it was on the terminal

		
		//if a body of if statement doesnot have curly braces, 
		//then only the first line of code after the condition 
		//is included in the body - so all the curly barces in 
		//this exercise are optional

	}
}