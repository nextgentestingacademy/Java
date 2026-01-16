package java_practice;

public class Day4_ConditionalStatements {

	public static void main(String[] args) {
//		boolean isLoginSuccessful = false;
//		if(isLoginSuccessful) {
//			System.out.println("Validate the Home page, and perform test execution for Home page");
//		}else {
//			System.out.println("Login was not successful, test case failed");
//		}
//		
//	System.out.println((isLoginSuccessful)?"Validate the Home page, and perform test execution for Home page":"Login was not successful, test case failed");
		
		String menu = "Finance";
		
		if(menu.equals("Admin")) {
			System.out.println("Click on Admin menu");
		}else if(menu.equals("Payment")) {
			System.out.println("Click on Payment menu");
		}else if(menu.equals("Dashboard")) {
			System.out.println("Click on Dashboard menu");
		}else {
			System.out.println("Click on Logout menu");
		}
		
		//switch case example - similar to if else if
		switch(menu) {
		case "Admin":
			System.out.println("Click on Admin menu");
			break;
		case "Payment", "Finance":
			System.out.println("Click on Payment menu");
			break;
		case "Dashboard":
			System.out.println("Click on Dashboard menu");
			break;
		default:
			System.out.println("Click on Logout menu");
		}
		
		System.out.println("This code is outside the switch statement");
		
//		boolean student = true;
//		int marks = 30;
//		if(student) {
//			if(marks > 35) {
//				System.out.println("Student has passed the exam");
//			}else {
//				System.out.println("Student has failed the exam");
//			}
//		}else {
//			System.out.println("You are not a student, so no marks are applicable");
//		}
		
		
	}

}
