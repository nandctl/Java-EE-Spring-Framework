package chapter03.item10.examples.violate.transitivity;

import java.awt.Color;

public class Test01 {

	public static void main(String[] args) {
		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);
		
		System.out.println(p.equals(cp)); // true
		System.out.println(cp.equals(p)); // fasle
		
	}
}
