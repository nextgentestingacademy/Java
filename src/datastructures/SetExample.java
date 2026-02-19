package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Set - does not allow duplicate values, and it has no indexing
		//interface - Set
		//Classes inherits Set - HashSet, TreeSet, LinkedHashSet
		//HashSet - fast and unordered
		//TreeSet - sorted set, slower than HashSet
		//LinkedHashSet - ordered by insertion
		
//		HashSet<String> browsers = new HashSet<String>();
//		browsers.add("Chrome");
//		browsers.add("Firefox");
//		browsers.add("Edge");
//		browsers.add("Edge");
//		
//		for(String s: browsers) {
//			System.out.println(s);
//		}
//		
//		TreeSet<Integer> numbers = new TreeSet<Integer>();
//		numbers.add(50);
//		numbers.add(10);
//		numbers.add(30);
//		
//		for(int i: numbers) {
//			System.out.println(i);
//		}
		
		LinkedHashSet<String> execSteps = new LinkedHashSet<String>();
		execSteps.add("Open Browser");
		execSteps.add("Login");
		execSteps.add("Logout");
		execSteps.add("Logout");
		
		for(String s: execSteps) {
			System.out.println(s);
		}
	}

}
