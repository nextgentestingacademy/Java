package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface - List
		//ArrayList, LinkedList implements List
		//inherit an interface --> implement the abstract methods
		//indexing
		
		//Arrays - fixed size
		String[] brow = new String[3];
		brow[0] = "Chrome";
		brow[1] = "Firefox";
		brow[2] = "Safari";
		
		//ArrayList is resizeable array
		
		//declare an ArrayList
		ArrayList<String> browsers = new ArrayList<String>();
		
		//initialize
		browsers.add("IE"); //index 0
		browsers.add("Safari"); //index 1
		browsers.add("Firefox"); //index 2
		
//		System.out.println(browsers);
		
		browsers.add(1, "Chrome");
//		System.out.println(browsers);
		
		browsers.set(0, "Edge");//replace a value at a particular index
		browsers.add("Chrome");
//		System.out.println(browsers);
	
		for(String s: browsers) {
			System.out.println(s);
		}
		
		System.out.println("Sorting browsers list");
		
		Collections.sort(browsers);
		for(String s: browsers) {
			System.out.println(s);
		}
		
		
		
		System.out.println(browsers.get(0));
		
		browsers.remove(0);
		System.out.println(browsers);
		
		browsers.clear();
		System.out.println(browsers);

		LinkedList<String> browsers1 = new LinkedList<String>();
		browsers1.add("Edge");
		browsers1.add("Chrome");
		browsers1.add("Firefox");
		System.out.println(browsers1);
		System.out.println("=================");
		
		browsers1.addFirst("IE");
		browsers1.addLast("Safari");
		System.out.println(browsers1);
		System.out.println("=================");
		browsers1.removeFirst();
		browsers1.removeLast();
		System.out.println(browsers1);
		System.out.println("=================");
		System.out.println(browsers1.getFirst());
		System.out.println(browsers1.getLast());

		Collections.sort(browsers1);
		System.out.println(browsers1);
		System.out.println("=================");
		
		Collections.sort(browsers1,Collections.reverseOrder());
		System.out.println(browsers1);
		System.out.println("=================");
	}
}