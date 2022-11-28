package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.add("a");
		p.add("b");
		p.add("c");
		p.add("d");
		System.out.println("print value "+ p);
		p.remove();
		System.out.println("print value after remove"+ p);
		
		System.out.println("print value with use of peek"+ p.peek());
		Iterator t= p.iterator();
		
		while(t.hasNext())
			System.out.println(t.next());
	}

}
