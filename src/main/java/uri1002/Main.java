package uri1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Circle c = new Circle();
		c.setRadius(entrada.nextDouble());
		entrada.close();		
		
		System.out.printf("A=%.4f",c.getArea());		
	}
}
