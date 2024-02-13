package coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hashMapExample {
	
	public static void main (String[] args) {

		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); // not synchronised and not thread safe. accepts 1 null key and any number of null values. Uses Iterator class to iterate over values
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // threadsafe and synchronised. does not accept null key value pairs. Uses enumerator to iterate over values

		
		hm.put(0, "wutda");
		hm.put(1, "amazin");
		hm.put(2, "beta");
		hm.put(3, "complainin");
		hm.put(10, "suff");
		hm.put(11, null);




		System.out.println(hm);
		System.out.println(hm.get(10));
		hm.remove(10);
		System.out.println(hm.get(10));
		
		//convert key value pairs to Set collection
		Set sn= hm.entrySet();
		Iterator it = sn.iterator();
		
		//hashtable pass table set collections
		while (it.hasNext()) 
		{
			
			System.out.println(it.next());

			Map.Entry mp = (Map.Entry)it.next();
			
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		
		
		
		
		ht.put(0, "wutda");
		ht.put(1, "amazin");
		ht.put(2, "beta");
		ht.put(3, "complainin");
		ht.put(10, "suff");

		System.out.println(ht);
		System.out.println(ht.get(10));
		ht.remove(10);
		System.out.println(ht.get(10));

		}


	}

}
