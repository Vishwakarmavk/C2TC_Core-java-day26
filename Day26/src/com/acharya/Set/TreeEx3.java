package com.acharya.Set;
import java.util.*;

public class TreeEx3 {

	public static void main(String[] args) {
	  SortedSet<String> s = new TreeSet<>();	
		s.add("Technology");
		s.add("Technical");
		s.add("quiz");
		s.add("code");
		SortedSet<String> beforeQuiz = s.headSet("quiz");
		SortedSet<String> afterCode = s.tailSet("quiz");
		System.out.println(s);
		System.out.println("Before Quiz: "+beforeQuiz);
		System.out.println("After Code "+afterCode);

	}

}
