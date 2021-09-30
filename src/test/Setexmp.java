package test;

import java.util.HashSet;

public class Setexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("name1");
		set1.add("name2");
		set1.add("name1");
		
		set1.add("name4");
		
		set1.add(null);
		set1.add(null);
		
		System.out.println(set1);
	}

}
