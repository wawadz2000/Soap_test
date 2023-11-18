package app;
import java.util.Scanner;

import services.remote.Calculateur;
import services.remote.CalculateurService;
import services.remote.Point;


public class Client {
	public static void main(String[] args) throws Exception {
		CalculateurService service = new CalculateurService();
		Calculateur souche = service.getCalculateurPort();
		
		float result;
		while (true) {
			Point p1 = new Point();
			Point p2 = new Point();
			Scanner sc = new Scanner(System.in);
			System.out.println("------Welcome-------");
			System.out.println("select operation: ");
			System.out.println("addition: 1");
			System.out.println("substraction: 2 ");
			System.out.println("multiplication: 3");
			System.out.println("division: 4");
			System.out.println("distance: 5");
			System.out.println("Select: ");
			int op = sc.nextInt();
			if (op != 5) {
				System.out.println("A = ");
				float a = sc.nextInt();
				System.out.println("B = ");
				float b = sc.nextInt();
				switch (op) {
				case 1:
					result = souche.addition(a, b);
					System.out.println(a + " + " + b + " = " + result);
					break;
				case 2:
					result = souche.soustraction(a, b);
					System.out.println(a + " - " + b + " = " + result);
					break;
				case 3:
					result = souche.multiplication(a, b);
					System.out.println(a + " * " + b + " = " + result);
					break;
				case 4:
					result = souche.division(a, b);
					System.out.println(a + " / " + b + " = " + result);
					break;
				}
			} else {
				System.out.println("P1x = ");
				float P1x = sc.nextInt();
				System.out.println("P1y = ");
				float P1y = sc.nextInt();
				System.out.println("P2x = ");
				float P2x = sc.nextInt();
				System.out.println("P2y = ");
				float P2y = sc.nextInt();
				p1.setX(P1x);
				p1.setY(P1y);
				p2.setX(P2x);
				p2.setY(P2y);
				result = souche.distance(p1, p2);
				System.out.println("distance between P1(" + P1x + "," + P1y + ")" + " and " + "P2(" + P2x + "," + P2y
						+ ")" + " is " + result);
			}
		}
	}
}
