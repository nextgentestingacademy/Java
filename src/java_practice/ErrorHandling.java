package java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ErrorHandling {
	
	

	public static void main(String[] args) {
		int a = 10;
		
		try {
			int result = a/0;
			System.out.println("Result: " + result);
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println("Error: Division by zero is not allowed." + e.getMessage());
		}catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
		finally {
			System.out.println("Executing finally block.");
		}
		
		System.out.println("End of the program");
		
		
//		System.out.println(a);
		
//		b = 90;// This will throw a compile-time error: cannot find symbol
		
//		System.out.println("Division by zero example:" + (a/0)); // This will throw ArithmeticException
		
		
//		int total = 2 + 2;
//		if(total == 5) {
//			System.out.println("Addition works!");
//		} 
		
		
	}

}
