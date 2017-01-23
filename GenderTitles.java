package Exercises;

import java.util.Scanner;

public class GenderTitles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title = "error";

		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender = keyboard.next();
		System.out.print("Age name: ");
		int age = keyboard.nextInt();

		if (age < 20) {
			title = first;
		}
		else {
			if (gender.equals("F")) {
				System.out.print("Are you married, "+first+"?(Y/N): ");
				String married = keyboard.next();
				if (married.equals("Y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if (gender.equals("M")) {
				title = "Mr.";
			}
		}

		System.out.println("\n"+title+" "+last);
	}
}


// nested if - an if statement inside anotehr if statement
// We don't have to declare all the vars at the top,
// you can wait until you are ready to use them. 
// we declare title early on so it will be in scope (the places in your program where a var is visible)
// a var remainns in scope until the block ends(})