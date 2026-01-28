package java_practice;

public class AccessPrivateVariable {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setPassword("pass@123");
		System.out.println(obj.getPassword());
		// System.out.println
	}

}
