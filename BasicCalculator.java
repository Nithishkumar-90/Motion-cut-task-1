package Calc.pack;


import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


public class BasicCalculator {
	
	public static void main(String[] args)
	{
		
		double num1, num2;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number : ");

		
		num1 = sc.nextDouble();
		System.out.println("Enter the Second number : ");
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");

		char op = sc.next().charAt(0);
		double o = 0;

		switch (op) {
		
		case '+':
			o = num1 + num2;
			break;

		
		case '-':
			o = num1 - num2;
			break;

		
		case '*':
			o = num1 * num2;
			break;

		
		case '/':
			if(num2!=0) {
			o = num1 / num2;
			}
			else {
				System.out.println("it is wrong");
			}
			break;

		default:
			System.out.println("You enter wrong input");
		}

		System.out.println("The final result:");
		System.out.println();

		
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}
