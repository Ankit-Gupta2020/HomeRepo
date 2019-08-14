package collectionFrameWork;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		TreeMap<Integer,String> tm1= new TreeMap<Integer,String>();
		
		tm.put(101, "java");
		tm.put(102, "ruby");
		tm.put(500, "python");
		tm.put(250,"C#");
		tm.put(102, "KLM");
		
		System.out.println(tm);
		
		System.out.println(tm.ceilingKey(249));
		System.out.println(tm.floorKey(249));
		System.out.println(tm.higherKey(250));
		System.out.println(tm.lowerKey(250));
		Map.Entry<Integer, String> me= tm.ceilingEntry(101);
		System.out.print(me.getKey());
		System.out.println(me.getValue());
		

		
		System.out.println(tm.descendingKeySet());

		TreeMap<String,Object> map1= new TreeMap<String,Object>();
		
		map1.put("uniquee", tm);
		
		System.out.println(map1);
		

	}

}
