package myownpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DuplicateNumbers {

	public static void main(String[] args) {

		String s="srujana is my baby";
		Map<Character,Integer> map=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		}
		System.out.println(map);
	Set<Entry<Character, Integer>> se=map.entrySet();
System.out.println(se);
		List<Entry<Character, Integer>> list=new ArrayList<>();
		list.addAll(se);
		System.out.println(list);
		Set<Character> set=map.keySet();
		for(Character s1:set)
		{
			if(map.get(s1)>1)
				System.out.println(s1+"----->"+map.get(s1));
		}
	}

}
