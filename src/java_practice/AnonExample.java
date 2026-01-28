package java_practice;

public class AnonExample {

	public static void main(String[] args) {
		
		
		// Anonymous class implementing the Greeting interface
		Greeting greet = new Greeting() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Hello from the anonymous class!");
			}
		};
		
		greet.sayHello();
	}
	
	

}
