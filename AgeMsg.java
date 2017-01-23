package JavaHard;

import java.util.Scanner;

public class AgeMsg {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\ttoo young to create a Facebook account.");
		
		} 
		else {System.out.println("\told enough to create a Facebook account.");}

		if (age < 16) {
			System.out.println("\ttoo young to get driver licence.");

		}
		else {System.out.println("\told enough to drive.");}

		if (age < 18) {
			System.out.println("\ttoo young to get a tatoo.");

		}
		else {System.out.println("\told enough to get a tatoo.");}

		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol.");

		}
		else {System.out.println("\told enough to drink alcohol.");}

		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");	

		}
		else {System.out.println("\told enough to run for President.");}

		if (age >= 65) {
			System.out.println("\tyou are old enought to retire.");

		}
		else {System.out.println("\tyou are still young to do things.");}

	}
}

// Study Drills: 
// 1. if age > 35, then nothing gets printed since we never specified that
// 2. look at the last if statement
// 3. look above for the else statement 