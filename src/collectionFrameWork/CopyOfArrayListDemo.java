package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class CopyOfArrayListDemo {

	
	
	public static void main(String[] args) {
		
		
		ArrayList <String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		
		
		//add objects in collection
		al.add("India");
		al.add("Aus");
		al.add("NZ");
		al.add("USA");
		al.add("Canada");
		
		System.out.println(al);
		//Collections.addAll(al, "MOSCOW");
		System.out.println(al);
		
		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add("4");
		al2.add("5");
		//Collections.copy(al, al2);
		//System.out.println(al);
		
		System.out.println(Collections.max(al));
		Collections.swap(al, 1, 4);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}
