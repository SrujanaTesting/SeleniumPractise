package myownpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		List<Integer> elements=new ArrayList<>();
		elements.add(19);
		elements.add(23);
		elements.add(3);
		elements.add(15);
		elements.add(2);
		elements.add(11);
		Collections.sort(elements);
		System.out.println(elements);
	}

}
