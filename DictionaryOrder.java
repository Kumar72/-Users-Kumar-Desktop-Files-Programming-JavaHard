package Exercises;

import java.util.Scanner;

public class DictionaryOrder {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;	

		System.out.print("Make up the name of a programming language!");
		name = keyboard.nextLine();		//nextLine()- used to read everything including spaces and tabs up until you press enter

		if ( name.compareTo("c++") < 0 )
			System.out.println( name +" come BEFORE c++");
		if ( name.compareTo("c++") == 0 )
			System.out.println(" c++ isn't a made-up language!");
		if ( name.compareTo("c++") > 0 )
			System.out.println( name +" comes AFTER c++");
		//the comparison involves two strings - 1st: on the left of compareTo and 2nd: in the paranthesis
		//if self.compareTo("other") - if self = other, then it equals 0
		// 							if self < other, we get a number less than 0... 

		if ( name.compareToIgnoreCase("go") < 0 )
			System.out.println( name +" come BEFORE go");
		if ( name.compareToIgnoreCase("go") == 0 )
			System.out.println( " go isn't a made-up language!");
		if ( name.compareToIgnoreCase("go") > 0 )
			System.out.println( name +" come AFTER go");

		if ( name.compareTo("java") < 0 )
			System.out.println( name +" come BEFORE java");
		if ( name.compareTo("java") == 0 )
			System.out.println(" java isn't a made-up language!");
		if ( name.compareTo("java") > 0 )
			System.out.println( name +" come AFTER java");

		if ( name.compareTo("lisp") < 0 )
			System.out.println( name +" come BEFORE lisp");
		if ( name.compareTo("lisp") == 0 )
			System.out.println(" lisp isn't a made-up language!");
		if ( name.compareTo("lisp") > 0 )
			System.out.println( name +" come AFTER lisp");
		
		if ( name.compareTo("python") < 0 )
			System.out.println( name +" come BEFORE python");
		if ( name.compareTo("python") == 0 )
			System.out.println(" python isn't a made-up language!");
		if ( name.compareTo("python") > 0 )
			System.out.println( name +" come AFTER python");
		
		if ( name.compareTo("ruby") < 0 )
			System.out.println( name +" come BEFORE ruby");
		if ( name.compareTo("ruby") == 0 )
			System.out.println(" ruby isn't a made-up language!");
		if ( name.compareTo("ruby") > 0 )
			System.out.println( name +" come AFTER ruby");

		if ( name.compareTo("visualbasic") < 0 )
			System.out.println( name +" come BEFORE visualbasic");
		if ( name.compareTo("visualbasic") == 0 )
			System.out.println(" visualbasic isn't a made-up language!");
		if ( name.compareTo("visualbasic") > 0 )
			System.out.println( name +" come AFTER visualbasic");		

	}
}

//PS. this doesn't work if we capatalize the first letter of what we enter
//	we can avoide the case problem by if (self.toLowerCase().compareTo(other.toLowerCase()) < 0)
//   					or  		if (self.compareToIgnoreCase(other) < 0)

/*	if ( self.compareTo(other) < 0 ) // true when self < other 
	if ( self.compareTo(other) <= 0 ) // true when self <= other 
	if ( self.compareTo(other) > 0 ) // true when self > other 
	if ( self.compareTo(other) >= 0 ) // true when self >= other 
	if ( self.compareTo(other) == 0 ) // true when self == other 
	if ( self.compareTo(other) != 0 ) // true when self != other
*/


