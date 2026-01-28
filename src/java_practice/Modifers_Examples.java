package java_practice;

public abstract class Modifers_Examples {
	public static String appUrl = "https://www.google.com/"; // public instance variable
	public static void main(String[] args) {
//		Modifers_Examples obj = new Modifers_Examples();
		enterPassword();
	}

	// public method - will be accessible from any other class
	public static void enterPassword() { //method will not be overridden (polymorphism)
		System.out.println("Entering password in the password field");
	}
	
	//abstract method - method without body
	abstract void sampleMethod();
	
	abstract void anotherMethod();
	
}
