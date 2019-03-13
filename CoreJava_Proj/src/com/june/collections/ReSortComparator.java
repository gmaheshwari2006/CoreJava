package com.june.collections;

import java.util.Comparator;

public class ReSortComparator implements Comparator<String>{
	public int compare(String a, String b) {

		return b.compareTo(a);
	}

}
