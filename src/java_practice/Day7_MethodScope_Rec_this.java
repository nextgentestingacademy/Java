package java_practice;

public class Day7_MethodScope_Rec_this {
	//class level
	static int num1, num2, result;
	
	public static void main(String[] args) {
		retry(1);
//		addition();
//		subtraction();
	}
	
	static void addition() {
		num1 = 50;
		num2 = 40;
		
		result = num1 + num2;
		System.out.println("Addition: " + result);
	}
	
	static void subtraction() {
		result = num1 - num2;
		System.out.println("Subtraction: " + result);
	}
	

	static void retry(int count) {
		if(count >= 3) {
			return; //exit the method
		}
		System.out.println("Retrying attempt number " + count);
		retry(++count);
	}
	
	
}
