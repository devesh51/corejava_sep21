package test;

import java.util.ArrayList; //dynamic in nature
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Listexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub<String>
		ArrayList<String> list = new ArrayList<String>();
		list.add("devesh");
		list.add("rahul");   // null is not allowed 
		list.add("upadhyay");
		list.add("boby");
		list.add("devesh"); // allowed two different values
		
		System.out.println(list);
		
		System.out.println(list.get(list.size()-1));
		
		System.out.println(list.get(1));
		
		for (int i=0;i<list.size();i++ ) {
			System.out.println(list.get(i));
		}
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String data:list) {
			System.out.println(data);
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.addFirst("devesh");
		  al.addLast("upadhyay");
		  
		  System.out.println(al);
		  Iterator <String> itr1 = al.listIterator();
		  while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		  
		  
		  Stack <String> stack = new Stack<String>();
		  stack.push("name1");
		  stack.push("name3");
		  stack.pop();
		  stack.push("name2");
		  stack.push("name4");
		  
		  System.out.println(stack);
		  System.out.println(stack.peek());
		  
		  
		  Vector<String> vector =new Vector<String>();
		  
		  vector.add("name1");
		  vector.add("name2");
		  vector.add("name3");
		  vector.add("name4");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
