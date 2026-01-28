package java_practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime currDtTm = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currDtTm);
		
		LocalDate today = LocalDate.now();
		System.out.println("Today's Date: " + today);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDtTm = currDtTm.format(dtf);
		System.out.println("Formatted Date and Time: " + formattedDtTm);
	}

}
