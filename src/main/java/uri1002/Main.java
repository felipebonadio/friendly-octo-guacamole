package uri1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Circle c = new Circle();
		c.setRadius(2.0);
		double area  = c.getArea();
		//TODO: format number!
		System.out.println(c.getArea());
		
	}
}
