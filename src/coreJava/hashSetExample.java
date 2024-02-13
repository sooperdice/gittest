package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
	
	public static void main (String[] args) {
		
		//Hashset treeset, linkedhashset, implements set interface
		// does not accept duplicate values
		//there is not guarantee elements stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Canada");
		hs.add("Canada");
		hs.add("sheee");
		hs.add("ggggdgd");



		System.out.println(hs);
		System.out.println(hs.contains("UK"));
		//System.out.println(hs.remove("Canada"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		//i.next();
		while (i.hasNext()) 
		{

		System.out.println(i.next());
		}
		//System.out.println(i.next());

		
	}

}
