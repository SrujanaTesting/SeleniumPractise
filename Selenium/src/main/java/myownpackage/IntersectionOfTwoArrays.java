package myownpackage;

import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {8,2,5,9};
		Set<Integer> inter=new TreeSet<>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;

			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j]) {
					count++;
				}
			}
			if(count>0)
			{
				inter.add(a[i]);

			}
		}
		System.out.println(inter);
	}

}
