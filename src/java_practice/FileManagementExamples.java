package java_practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagementExamples {

	public static void main(String[] args) throws IOException {
		// Create a File object representing a file named "results.txt"
		File objFile = new File("results.txt");
		
		// Create the file on the filesystem
//		if(objFile.createNewFile()) {
//			System.out.println("File created: " + objFile.getName());
//		} else {
//			System.out.println("File already exists.");
//		}
		
//		//Write to the file using FileWriter
//		FileWriter objWriter = new FileWriter("results.txt");
//		objWriter.write("Test Execution started");
//		objWriter.close();
//		
//		System.out.println("Successfully wrote to the file.");
//		
//		//Write in append mode
//		FileWriter objWriterAppend = new FileWriter("results.txt", true);
//		objWriterAppend.write("\nTest Execution completed");
//		objWriterAppend.close();
//		System.out.println("Successfully appended to the file.");
		
		//Read the file using Scanner
//		Scanner objScanner = new Scanner(objFile);
//		
//		System.out.println("Reading the file content:");
//		while(objScanner.hasNextLine()) {
//			System.out.println(objScanner.nextLine());
//		}
//		objScanner.close();
		
		//Delete the file
		if(objFile.delete()) {
			System.out.println("Deleted the file: " + objFile.getName());
		} else {
			System.out.println("Failed to delete the file. Maybe it doesn't exist.");
		}
	}

}
