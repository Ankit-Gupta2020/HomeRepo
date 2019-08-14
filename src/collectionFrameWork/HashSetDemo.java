package collectionFrameWork;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs = new HashSet<String>();
		
		
		hs.add("Java");
		hs.add("Python");
		hs.add("C#");
		hs.add("Ruby");
		System.out.println(hs);
		
		System.out.println(hs.contains("VB"));
		System.out.println(hs.contains("Java"));
		
		hs.remove("Ruby");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.add(null);
		hs.add(null);
		hs.add("Java");
		System.out.println(hs);
		
		
		
	}

}
