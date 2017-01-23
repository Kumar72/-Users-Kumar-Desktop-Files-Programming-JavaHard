package JavaHard;

import java.util.Scanner;

public class SecretW {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age = 25;
		double allure = 7.5;
		boolean onGuestList = false;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club.");
		}
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}