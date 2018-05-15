package myownpackage;

import java.util.*;

public class SortKeys {

	int a;
	int b;
	public void add(int a,int b)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println(al.add(10));
		Set<Integer> se=new HashSet<>();
		se.add(1);
		se.add(1);
		System.out.println(se);
		Map<Integer,String> newMap=new HashMap<>();
		newMap.put(21, "Twenty One");
		newMap.put(41, "Fourty One");
		newMap.put(31, "Thirty One");
		newMap.put(31,"Fifty One");
		System.out.println(newMap.entrySet());
	
		Map<Integer,String> newMap1=new TreeMap<>(newMap);
		System.out.println(newMap1);
		/*for(Map.Entry<Integer,String> map:newMap.entrySet())
		{
			newMap1.put(map.getKey(), map.getValue());
		}*/
		/*\Set<Integer> newSets=new TreeSet<Integer>();
	for(Integer key:newMap.keySet())
	{
		newSets.add(key);
	}
	for(Integer newSet:newSets )
	{
		newMap1.put(newSet, newMap.get(newSet));
	}*/
	//System.out.println(newMap1);
	}
	
}
