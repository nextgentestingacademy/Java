package java_practice;

public class Day3_DataTypes {

	public static void main(String[] args) {
		//primitive data type
		byte num1 = 115; //-128 to 127
		short num2 = 10000; //-32,768 to 32767
		int num3 = 100023;
		long num4 = 1232343434;

		float num5 = 124.1242f;
		double num6 = 2323.234234d;
		
		boolean execStatus = false;
		char intialName = '2';
		
		
		//non primitive data type - String, Arrays, Class
		String name = "Rahul";
		
		//var keyword
		var mobile = 918282;
		
		double newNum1 = num1;
		System.out.println(newNum1);
		
		//Narrowing Casting
		int num7 = (int) newNum1;
		System.out.println(num7);
		System.out.println(num1);
	}

}
