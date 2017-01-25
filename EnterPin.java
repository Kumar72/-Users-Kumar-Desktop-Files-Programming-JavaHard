package Exercises;

import java.util.Scanner;

public class EnterPin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, enter;
		String password;

		pin = 12345;
	//	password = "java";

		System.out.println("Welcome to the BANK of JAVA");
		
		System.out.print("Enter your Password: ");
		password = keyboard.next();
		
		while (!password.equals("java")) {
			System.out.println("\nINCORRECT Password. Try again.");
			System.out.print("Enter your Password: ");
			password = keyboard.next();

		}

		System.out.print("Enter your PIN: ");
		enter = keyboard.nextInt();

		while (enter !=pin) {
			System.out.println("\nINCORRECT PIN. Try again.");
			System.out.print("Enter your PIN: ");
			enter = keyboard.nextInt();
		}
	

		System.out.println("\nPIN ACCEPTED. Your Account Balance is $3721.72");

	}
}