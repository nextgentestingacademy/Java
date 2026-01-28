package java_practice;

import java.util.Scanner;

public class JavaUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter browser name: ");
		String browser = sc.nextLine();
		
		System.out.println("User selected browser as: " + browser);
	
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("User age is: " + age);
		sc.close();
	}

}
