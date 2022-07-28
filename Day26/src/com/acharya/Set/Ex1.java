package com.acharya.Set;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		LinkedHashSet obj = new LinkedHashSet();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Apple");
		obj.add("Lemon");
		System.out.println("LinkedHashSet List; "+obj);
		Object[] arr = obj.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
