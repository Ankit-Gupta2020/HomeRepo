package collectionFrameWork;

import java.util.TreeSet;

public class TreeHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(10);
		ts.add(15);
		ts.add(0);
		ts.add(-1);
		ts.add(50);
		ts.add(-100);
		
		System.out.println(ts);
		
		System.out.println(ts.ceiling(2));
		System.out.println(ts.floor(2));
		System.out.println(ts.higher(10));
		
		
		System.out.println(ts.headSet(1));
		System.out.println(ts.tailSet(1));
		System.out.println(ts.headSet(10, true));
		System.out.println(ts.headSet(10, false));
		
		System.out.println(ts.subSet(10, false, 15, true));
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.pollFirst());
		System.out.println(ts.first());
		
		
	}

}
