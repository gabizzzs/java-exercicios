package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width ande height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("Area = %.2d%n", rect.area());
		System.out.println("Perimeter = %.2f%n", rect.perimeter());
	}
}
