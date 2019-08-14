package collectionFrameWork;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("aperewerple");
		pq.add("apple");
		pq.add("orange");
		pq.add("banana");
		pq.add("guvava");
		pq.add("agede");
		System.out.println(pq);
		
		Iterator<String> itr  = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
