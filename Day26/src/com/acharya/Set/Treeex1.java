package com.acharya.Set;
import java.util.*;

public class Treeex1 {

	public static void main(String[] args) {
		SortedSet<String> site = new TreeSet<>();
		site.add("Technology");
		site.add("Technical");
		site.add("quiz");
		site.add("code");
		System.out.println("Sorted Set: "+site);
		System.out.println("First: "+site.first());
		System.out.println("Last: "+site.last());

	}

}
