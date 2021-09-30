package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Queueexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("name1");
		queue1.add("name12");
		queue1.add("name2");   // never allow any null value
		queue1.add("name7");    // duplicate value allow but not null
		
		System.out.println(queue1);
		
		System.out.println(queue1.peek());
		
		System.out.println(queue1.poll());
		
		String frist= queue1.poll();
		
		System.out.println(queue1);
		
		
		ArrayDeque<String> queue2 = new ArrayDeque<String>();
		queue2.add("name1");
		queue2.add("name2");
		queue2.add("name4");
		queue2.add("name3");
		
		queue2.addFirst("devesh");
		queue2.addLast("upadhyay");
		
		System.out.println(queue2);
		
		
		
		
		
		
		
		
	}

}
