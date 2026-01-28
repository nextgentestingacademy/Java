package java_practice;

public class AppTest extends BaseTest{
	String name;
	void setup() {
		super.setUp();
		super.name="Selenium";
		System.out.println("AppTest - setUp method");
	}
	
	public static void main(String[] args) {
		AppTest appTest = new AppTest();
		appTest.setup();
	}
}
