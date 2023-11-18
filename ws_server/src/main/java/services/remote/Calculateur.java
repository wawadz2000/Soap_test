package services.remote;

import jakarta.jws.WebService;
import models.Point;
@WebService
public class Calculateur implements Operations {

	@Override
	public float addition(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("Je viens soustraire deux nombres " + a + " + " + b);
		return a + b;
	}

	@Override
	public float soustraction(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("Je viens soustraire " + a + " - " + b);
		return a - b;
	}

	@Override
	public float division(float a, float b) {
		// TODO Auto-generated method stub
		if (b == 0 || a == 0) {
			throw new ArithmeticException("La division sur zéro est non autorisée.");
		}
		System.out.println("Je viens de diviser " + a + " sur " + b);
		return a / b;
	}

	@Override
	public float multiplication(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("Je viens de multiplier " + a + " par " + b);
		return a * b;
	}

	@Override
	public float distance(Point a, Point b) {
		float x1 = a.getX();
		float y1 = a.getY();
		float x2 = b.getX();
		float y2 = b.getY();

	    return (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

}
