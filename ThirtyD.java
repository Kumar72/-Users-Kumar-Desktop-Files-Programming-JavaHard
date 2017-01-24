package Exercises;

import java.util.Scanner;

public class ThirtyD {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int month, days;
		String monthName;

		System.out.print("Which month? (1-12) ");
		month = keyboard.nextInt();

		switch (month) {
			case 1: monthName = "January";
				break;
			case 2: monthName = "February";
				break;
			case 3: monthName = "March";
				break;	
			case 4: monthName = "April";
				break;
			case 5: monthName = "May";
				break;
			case 6: monthName = "June";
				break;		
			case 7: monthName = "July";
				break;
			case 8: monthName = "August";
				break;
			case 9: monthName = "September";
				break;
			case 10: monthName = "October";
				break;
			case 11: monthName = "November";
				break;
			case 12: monthName = "December";
				break;						
			default: monthName = "error";
			}
	/* 	Thirty days hath September, April, June, and November
		All the rest have thirty-one
		Except the second month alone....
	*/
			switch (month) {
				case 9:
				case 4:
				case 6:
				case 11: days = 30;
							break;
				case 2: days = 28;
							break;
				default: days = 31;

			}

			System.out.println(days+" days hath "+monthName);

	}
}

/*
	Inside the body of switch are several case x:'s followed by code,
	you can have as many lines BUT you're not allowed to declare any
	var inside the switch statement. 
	Also, after all the code we enter the keyword break - marks the end of a case

	What happens is that the computer onces gets the input, then it 
	looks through the switch until it finds a case that matches the input

	a case (or multiple cases) will be executed unless a break is reached (ex line 45-50)
	
*/
