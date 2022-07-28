package com.acharya.Set;
import java.util.*;

public class TreeEx5 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>
		(Arrays.asList("blue","yellow","orange","white","balck","green","brown"));
            System.out.println(ts);
             Set subSet = ts.subSet("orange",false,"yellow",true);
             System.out.println(subSet);
             subSet= ts.subSet("blue", false, "orange", false);
             System.out.println(subSet);
             subSet = ts.subSet("green", false,"yellow", true);
             System.out.println(subSet);
            
	}

}
