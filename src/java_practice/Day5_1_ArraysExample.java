package java_practice;

public class Day5_1_ArraysExample {

	public static void main(String[] args) {
		//declaring an array
		String[] browsers = new String[3];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "edge";
//		System.out.println(browsers[2]);
//		browsers[2] = "safari";
//		System.out.println(browsers[2]);
		
		for(int i=0;i<browsers.length;i++) {
			System.out.println(browsers[i]);
		}
		
		for(String s:browsers) {
			System.out.println(s);
		}
		
//		System.out.println(browsers[3]);
//		String[] browsers = {"chrome","firefox","edge"};
		
//		int[] numbers = {12,34,23};
//		
////		String brow = "safari";
////		System.out.println(brow);
//		System.out.println(browsers[0]);

		
	}

}
