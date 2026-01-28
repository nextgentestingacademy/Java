package java_practice;

public class BaseTest {
	String name;
	public static void launchBrowser() {
		System.out.println("Chrome Browser launched");
	}
	
	//parent class method
	void setUp() {
		System.out.println("BaseTest - setUp method");
	}
}
