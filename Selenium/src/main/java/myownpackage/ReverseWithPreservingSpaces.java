package myownpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWithPreservingSpaces {

	public static void main(String[] args) {

		String s="Iam a good girl";
		char c[]=s.toCharArray();
		char c1[]=new char[c.length];
		for(int i=0;i<s.length();i++)
		{
			if(c[i]==' ')
			{
				c1[i]=c[i];
			}
		}
		
		int x=0;
		for(int j=c.length-1;j>=0;j++)
		{
			if(c1[x]!=' ') {
				c1[x]=s.charAt(j);
			}
			else {
				c1[x+1]=s.charAt(j);
			}
			x++;
			
		}
		System.out.println(Arrays.toString(c));
	}

}
