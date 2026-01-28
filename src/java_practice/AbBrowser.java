package java_practice;

//can have both abstract and normal methods
abstract class AbBrowser {
		//abstract method - just definition, no body
		abstract void openBrowser();//implementation in subclass/child class
		
		//normal method - has body
		void closeBrowser() {
			System.out.println("Closing the browser");
		}
}
