package com.june.collections;

import java.util.Arrays;

public class SearchObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] sa = {"one", "two", "three", "four"};
		Arrays.sort(sa); // #1
		for(String s : sa)
		System.out.print(s + " ");
		
		System.out.println("\none = " + Arrays.binarySearch(sa,"pgfive")); // #2 (-1-1) --(-index-1)
		
		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator(); // #3
		Arrays.sort(sa,rs);
		for(String s : sa)
		System.out.print(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa,"one")); // #4
		System.out.println("one = " + Arrays.binarySearch(sa,"one",rs));
	}
	

}
