package java_practice;

public class Day6_Login {

	public static void main(String[] args) {
		accountStatement();
		fundTransfer();
	}
	
	//Method Overloading - Polymorphism (many forms)
	static void login(String userid, String pwd) {
		System.out.println("Entered username: " + userid);
		System.out.println("Entered password: " + pwd);
		System.out.println("Clicked Login button");
		System.out.println("Validate home page");
	}
	
	
	static void login() {
		System.out.println("Entered username: kunal.patil");
		System.out.println("Entered password: kunal@123");
		System.out.println("Clicked Login button");
		System.out.println("Validate home page");
	}

	static void login(int mobile) {
		System.out.println("Entered mobile: " + mobile);
		System.out.println("Clicked Login button");
		System.out.println("Validate home page");
	}
	

	static void login(String gmailID) {
		System.out.println("Entered gmailID: " + gmailID);
		System.out.println("Clicked Login button");
		System.out.println("Validate home page");
	}
	
	static void accountStatement() {
		login();
		
		//below code accountStatement
		System.out.println("Validated the account statment");
	}
	
	static void fundTransfer() {
		login("rahul.kamat","pass@123");
		
		//below code for fund transfer
		System.out.println("Transferred funds from account 1 to 2");
	}
}
