package com.acharya.Set;
import java.util.*;

public class TreeEx4 {

	public static void main(String[] args) {
		SortedSet<String> ts = new TreeSet<>
		(Arrays.asList("black","blue","orange","green","white","brown","Yellow"));
		   System.out.println(ts);
		   Set<String> subSet = ts.subSet("green","white");
		   System.out.println("SubSet :" +subSet);
		   subSet = ts.subSet("Yellow","blue");
		   System.out.println("SubSet :"+subSet);
		   

	}

}
