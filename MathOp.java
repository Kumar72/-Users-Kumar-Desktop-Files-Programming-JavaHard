package JavaHard;

public class MathOp {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h;
		double x, y, z, w;
		String one, two, both;

		a = 10;
		b = 27;

		System.out.println ("a is "+a+", b is "+b);

		c = a + b;
		d = a - b;
		e = a + b * 3;
		f = b / 2;			// 37/2 is shown as 13 (an integer not a floating pt)
		g = b % 10;       	/* % = remainder after dividing b/10 */

		System.out.println("a + b is "+c);
		System.out.println("a - b is "+d);
		System.out.println("a + b * 3 is "+e);
		System.out.println("b / 2 is "+f);
		System.out.println("b % 10 is "+g);

		x = 1.1;
		y = x * x;
		z = b / 2;

		System.out.println("\nx is "+ x);
		System.out.println("x * x is "+y);
		System.out.println("b / 2 is "+z);
		System.out.println();

		one = "dog"; 
		two = "house";
		both = one + two;
		System.out.println(both);


		h = c - d;
		w = .333 * x;

		System.out.println("(a + b) - (a - b) is "+h);
		System.out.println("1/3 of x is "+w+ );

	}
}