package com.acharya.Set;
import java.util.*;

public class Retainall {

	public static void main(String[] args) {
				Set<Integer> b = new LinkedHashSet<>();
				b.add(1);
				b.add(2);
				b.add(3);
				b.add(4);
				b.add(5);
				b.add(6);
				System.out.println(b);
				ArrayList<Integer> c = new ArrayList<>();
				c.add(4);
				c.add(5);
				c.add(9);
				c.add(7);
				System.out.println(c);
				c.retainAll(b);
				System.out.println(c);
				System.out.println(b);

	}

}
