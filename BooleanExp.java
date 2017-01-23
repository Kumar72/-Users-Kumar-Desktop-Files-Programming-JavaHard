package JavaHard;

import java.util.Scanner;

public class BooleanExp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y; 

		System.out.print("Give me two numbers. First: ");
			x = keyboard.nextDouble();
		System.out.print("Second: ");
			y = keyboard.nextDouble();
		

		a = (x < y);		// all variables are asked if they are true or false
		b = (x <= y);		// we compare x with y and if the comparison is right
		c = (x == y);		// then the result = true else false
		d = (x != y);
		e = (x > y);
		f = (x >= y);

		System.out.println (x+" is LESS THAN "+y+":"+ a);	
 		System.out.println (x+" is LESS THAN / EQUAL TO "+y+":"+ b);
 		System.out.println (x+" is EQUAL TO "+y+":"+ c);
 		System.out.println (x+" is NOT EQUAL TO "+y+":"+ d);
 		System.out.println (x+" is GREATER THAN "+y+":"+ e);
 		System.out.println (x+" is GREATER THAN / EQUAL TO "+y+":"+ f);

 		System.out.println(); 	//we introduce the not operator: (!) - which takes the logical opposite
 		System.out.println( !(x < y)+" "+ (x >= y)); 		//if true we get false
 		System.out.println( !(x <= y)+" "+ (x > y));
 		System.out.println( !(x == y)+" "+ (x != y));
 		System.out.println( !(x != y)+" "+ (x == y));
 		System.out.println( !(x > y)+" "+ (x <= y));
 		System.out.println( !(x >= y)+" "+ (x < y));

 							//opposite.     actual  
	}
}

