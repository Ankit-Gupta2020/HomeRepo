package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	
	
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
		Collections.addAll(al, "MOSCOW");
		System.out.println(al);
		//add at nth index
		
		al.add(3,"Japan");
		
		al.remove(2);
		
		
		//itrator
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//second collections
		
		al2.add("Delhi");
		al2.add("Canbera");
		al2.add("Welinton");
		al2.add("Washinton");
		al2.add("Otava");
		
		
		al.addAll(al2);
	
		
		System.out.println("------------------------");
		
		Iterator<String> itr1 = al.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("------------------------");
		//al.removeAll(al2);
		
		Iterator<String> itr2 = al.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		System.out.println("index at 3 " + al.get(3));
	
		al.set(3, "UK");
		System.out.println("NEW index at 3 " + al.get(3));
		
		System.out.println("------------------------");
		
		Collections.sort(al,Collections.reverseOrder());
		
		Iterator<String> itr3 = al.iterator();
		
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
		
		System.out.println(al.contains("Pakistan"));
		
		System.out.println(al.containsAll(al2));
	}
}
