package java_practice;

public class Day5_Loop {

	public static void main(String[] args) {
//		int reTryCount = 1;
//		while(reTryCount < 3) {
//			reTryCount++;
//			System.out.println("Retried " + reTryCount + " number of time/s");
//		}
//		System.out.println("Outside the while loop");
//	
//		do {
//			System.out.println("Retried " + reTryCount + " number of time/s");
//			reTryCount++;
//		}while(reTryCount < 3);
//
//		System.out.println("Outside the Do loop");
//
		for(int i=10;i>=5;i--) {
			if(i==7) {
				continue;
			}
			
			System.out.println("Executing test case number: " + i);
			
		}
		System.out.println("Outside the for loop");
		
//		for(int col=1;col<=3;col++) {
//			for(int row=1;row<=5;row++) {
//				System.out.print(" - " + "row " + row + " and col " + col);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Outside the for loop");

	
		
	
	}
}