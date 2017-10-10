package com.mf.aosjunit;
import java.util.Scanner;
public class speakers {
 	@SuppressWarnings("resource")
	public static void main(String args[]) {
 
 		// input to print Fibonacci series upto how many numbers
		log("Enter number which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
 
		log("\nUsing Method-1: Using Recursion. Provided Number: " + number);
		// printing Fibonacci series upto number
		for (int i = 1; i <= number; i++) {
			log(fibonacciRecusion(i) + " ");
		}
 
		log("\nMethod-2: Fibonacci number at location " + number + " is ==> " + (fibonacciLoop(number) + ""));
 	}
 	
 	 	 	 	 	
	// Method-1: Java program for Fibonacci number using recursion.
	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
			
		}
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
	}
		
		
 	// Method-2: Java program for Fibonacci number using Loop.
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		

		
		return fibonacci; // Fibonacci number
	}
 
	private static void log(String number) {
	System.out.println(number);
	}
			
	public static void dummycode(int number) {
		int a;
		
		int j = number % 10;
	//	System.out.println("The Reminder is " + j);
		if (j == 1) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
		}
		if (j == 2) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			
		}
		if (j == 3) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
		}
		if (j == 5) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
		}
		if (j == 6) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
		}
		if (j >= 7) {
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			a =0;
			a = 1;
			a = 2;
			a = 3;
			a = 4;
			a = 5;
			
		}
	

	}
 
}
