package application;

import java.util.Scanner;

import entities.Employee;

public class Program {
	public void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
	
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp.name + ", $ " + emp.netSalary());
		
		System.out.println("Witch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
	}
}
