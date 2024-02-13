package coreJava;

import java.util.ArrayList;

public class arrayListexample {
	// can accept duplicate values 
	//ArraList,LinkedList,vector- Implementing List interface 
	//array have fixed size where as arraylist can grow dynamicaly 
	//you can access and insert any value in any index
	
	public static void main (String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("ash");
		a.add("uava");
		System.out.println(a);
		
		a.add(0, "student");
		a.get(2);
		System.out.println(a.get(2));

		a.remove("student");
		a.add("uava");

		System.out.println(a);
		System.out.println(a.contains("student"));
		System.out.println(a.indexOf("ash"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

		
	}

}
