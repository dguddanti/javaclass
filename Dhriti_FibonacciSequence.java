package com.robotics;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		
		System.out.println("This program returns the first n numbers of the Fibonacci sequence.");
		
		System.out.println("Enter n:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String fibonacci_series;
		fibonacci_series = "";
		
		
		int i = 1; int t1 = 0; int t2 = 1;
		
		System.out.println("First " + n + " terms:");
		
		while (i <= n) {
		 fibonacci_series += (t1 + ", ");
			
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
			i++;
		}
		System.out.println(fibonacci_series);
	}

}
