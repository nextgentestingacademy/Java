package java_practice;

public class LoginPage {
	
	//storing all webelements and methods related to a specific page - LoginPage
	String name;
	
	//a method that has the same name as class name - constructor
	LoginPage() {
		name = "Rahul";		
		//initialize webdriver
		//load a particular file (configuration - url, browser, etc.)
		System.out.println("Constructor code is executed");
	}

	String printName() {
		return ("Name is " + name);
	}
	
	
	String enterUsername(String username) {
		
		return ("Enter username " + username);
	}
	
	String enterPassword(String password) {
		return ("Enter password " + password);
	}
	
	String clickLogin() {
		return ("Clicked on Login button");
	}

}
