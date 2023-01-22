package com.velocity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		int a[] = {1,1,1,45,45,18,18,18,10};
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i =0; i<a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);

	}

}
