package com.acharya.Set;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
      Set<String> v= new HashSet<>();
      v.add("a");
      v.add("e");
      v.add("i");
      ArrayList<String> vl = new ArrayList<>(v);
      System.out.println("Vowels Set: "+v);
      System.out.println("Vowels List: "+vl);
      v.add("o");
      vl.add("a");
      vl.add("u");
      System.out.println("Vowels Set: "+v);
      System.out.println("Vowels List:"+vl);
      v = new HashSet<>(vl);
      System.out.println("Vowels Set: "+v);
      

	}

}
