package myownpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		//Collections c=new Collections();
		
		list.add(2);
		list.add(2);
		list.add(45);
		list.add(2);
		list.add(54);
		list.add(6);
		list.add(45);
		list.add(2);
		list.add(98);
		list.add(54);
		Set<Integer> set=new TreeSet<Integer>(list);
		list.clear();;
		list.addAll(set);
		System.out.println(list);
		
	}

}
