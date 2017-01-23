package JavaHard;

import java.util.Scanner;

public class RudeQ {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;
		double weight, income;

		System.out.print("\nHello. What is your name?\t");
			name = keyboard.next();

		System.out.print("Hello "+name+"! How old are you?\t");
			age = keyboard.nextInt();
		System.out.println("So you are "+age+", eh? That's not very old.");
		
		System.out.print("\nHow much do you weigh,"+name+"?\t");
			weight = keyboard.nextDouble();
		System.out.print(weight+"! Better keep that quiet!!");

		System.out.print("Finally, what's your income, "+name+"?\t");
			income = keyboard.nextDouble();
		System.out.print("Hoepfully that is "+income+" per hour and not per year!\n");
		System.out.print("Well, thanks for answering my rude questions, "+name+".\n");

	}
}

/*
Study Drills:
	1. program shouldn't blow up if I put int. value when it expects me to type double.
		b/c double variable includes int but not strings. 
	2. Nope, stings include doubles and int. so it won't blow up
	3. Sting doesn't blow up EVER; Doubles blows up if you put in word; Int. will blow up if you put in doubles or word
*/