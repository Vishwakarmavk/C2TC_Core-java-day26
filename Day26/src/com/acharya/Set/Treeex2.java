package com.acharya.Set;
import java.util.*;

public class Treeex2 {

	public static void main(String[] args) {
		SortedSet<String> s =new TreeSet<>();
		s.add("Technology");
		s.add("Technical");
		s.add("quiz");
		s.add("code");
		System.out.println(s);
		Iterator i = s.iterator();
		System.out.println("After Iterator:");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
