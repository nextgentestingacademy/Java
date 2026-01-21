package java_practice;

public class LoginTest {

	public static void main(String[] args) {
		//create an object of a class
		//<class name> <objectname> = new <classname>();
		LoginPage login = new LoginPage();
		System.out.println(login.enterUsername("rahul.kamat"));
		System.out.println(login.enterPassword("pass@123"));
		
	}

}
