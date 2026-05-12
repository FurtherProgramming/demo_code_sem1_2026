package Week06;

import java.util.ArrayList;
import java.util.LinkedList;

public class Access {
	public static void main(String[] args) {
		int size = 10000000;
		// ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		list.get(list.size()/2);
		long end = System.nanoTime();
		
		System.out.println("Time of access for ArrayList: " + (end - start));
		
		
		// LinkedList
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		for(int i = 0; i < size; i++) {
			linkedlist.add(i);
		}

		start = System.nanoTime();
		linkedlist.get(list.size()/2);
		end = System.nanoTime();

		System.out.println("Time of access for LinkedList: " + (end - start));
	}
}