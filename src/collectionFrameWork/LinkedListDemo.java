package collectionFrameWork;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList <String> ll  = new LinkedList<String>();
		
		
		
		ll.add("Jaipur");
		ll.add("Mysore");
		ll.add("Banglure");
		ll.add("Mumbai");
		ll.add("Pune");
		System.out.println(ll);
		
		ll.addFirst("Delhi");
		System.out.println(ll);
		
		ll.addLast("Ajmer");
		
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.get(4));
		
		
		ll.offerFirst("Shimla");
		System.out.println(ll);
		ll.offer("Chennai");
		System.out.println(ll);
		
		
		System.out.println(ll.peek());
		System.out.println(ll.peekLast());
		System.out.println(ll.peekFirst());
		System.out.println("---");
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println("---");
		System.out.println(ll);
	int length =ll.size();
	System.out.println(length);
	
		ll.clear();
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.peek());
		System.out.println(ll.peekLast());
		System.out.println(ll.peekFirst());
		
		System.out.println(ll.getLast());
		
	
	}

}
