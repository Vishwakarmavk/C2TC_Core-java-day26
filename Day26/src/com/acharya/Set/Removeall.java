package com.acharya.Set;
import java.util.*;

public class Removeall {

	public static void main(String[] args) {
				Set<Integer> b = new LinkedHashSet<>();
				b.add(34);
				b.add(54);
				b.add(98);
				System.out.println(b);
				ArrayList<Integer> c = new ArrayList<>();
				c.add(76);
				c.add(9);
				c.add(98);
				System.out.println(c);
				c.removeAll(b);
				System.out.println(c);
				System.out.println(b);


	}

}
