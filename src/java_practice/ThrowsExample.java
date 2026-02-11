package java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
	
	static void readFile() throws FileNotFoundException {
		//write a code to read a file
		File file = new File("example.txt");
		Scanner scanner = new Scanner(file);
		
		scanner.nextLine();
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				readFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}

}
