package myownpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new FileReader("./textfile/sentence.txt"));
		
		Map<String,Integer> map=new TreeMap<>();
		String str=br.readLine();
		String[] words=str.toLowerCase().split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
			Integer freq=map.get(words[i]);
			if(freq!=null)
			{
				map.put(words[i], freq+1);
			}
			else
			{
				map.put(words[i], 1);
			}
		}
		System.out.println(map);
	}

}
