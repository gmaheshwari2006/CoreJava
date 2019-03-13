package com.june.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		List<List<Integer>> table = new ArrayList<List<Integer>>();

		for (int i = 0; i <= 10; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= 10; j++)
				row.add(i * j);
			table.add(row);
		}
		for (List<Integer> row : table)
			System.out.println(row);
		before();
	}

	public static void before() {
		Set set = new TreeSet();
		set.add(2);
		set.add(3);
		set.add(1);
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
	}

}
