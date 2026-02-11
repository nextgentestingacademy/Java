package java_practice;

public class ThrowExample {

	static void validateAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Age must be at least 18 to vote.");
		} else {
			System.out.println("You are eligible to vote.");
		}
	}
	
	public static void main(String[] args) {

		try {
			validateAge(15);
		}catch(ArithmeticException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
		System.out.println("End of the program.");
	}

}
