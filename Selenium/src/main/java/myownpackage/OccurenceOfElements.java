package myownpackage;

import java.util.Map;
import java.util.TreeMap;

public class OccurenceOfElements {

	public static void main(String[] args) {
String s="Iam a good girl";
int a[]= {1,3,4,7,3,6,1,1,6,4,4,7,5};
Map<Integer,Integer> map=new TreeMap<>();
for(int i=0;i<a.length;i++)
{
	Integer freq=map.get(a[i]);
	if(freq==null)
	{
		map.put(a[i], 1);
	}
	else {
		map.put(a[i], freq+1);
	}
}
System.out.println(map);
	}

}
