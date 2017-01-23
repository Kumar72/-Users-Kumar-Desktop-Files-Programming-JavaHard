package JavaHard;

import java.util.Scanner;

public class Sequencing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price = 0, salesTax, total;  //when you declare and initialize a variable at the same time, that is called "defining" the variable

		System.out.print("How much is the purchase price? ");
		price = keyboard.nextDouble();
		
		salesTax = price*0.0825;
		total = price + salesTax;
		
		System.out.println("Item price:\t"+ price);
		System.out.println("Sales tax:\t"+ salesTax);
		System.out.println("Total cost:\t"+ total);

	}
}

// sequences of instruction do matter 

/*
	Study Drills:

	1. on the actual code, where line 13 and 14 came before line 10-11,
	taking away = 0 in line 8 will tell you that element price is not defined
	and therefore it cannot calculate the value. (it shows up as an error)
	2. already done above and it works
	3. removing = 0 doesn't affect the code anymore 
*/