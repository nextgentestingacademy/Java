package java_practice;

public class EnumExample {

	enum Browsers {
		CHROME,
		FIREFOX,
		SAFARI,
		EDGE
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser(Browsers.FIREFOX);
	}
	
	//method implementation
	public static void launchBrowser(Browsers browser) {
		
		switch (browser) {
		case CHROME:
			System.out.println("Launching Chrome browser");
			break;
		case FIREFOX:
			System.out.println("Launching Firefox browser");
			break;
		case SAFARI:
			System.out.println("Launching Safari browser");
			break;
		case EDGE:
			System.out.println("Launching Edge browser");
			break;
		default:
			System.out.println("Please pass the right browser: " + browser);
			break;
		}
	}

}
