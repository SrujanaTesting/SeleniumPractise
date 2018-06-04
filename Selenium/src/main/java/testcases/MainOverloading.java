package testcases;
import java.util.Arrays;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class MainOverloading {
	
	public static void main(String[] args) {
		String s1="Srujana";int count=0;
		String s2="Nallapaneni";
		for(int i=0;i<s1.length();i++) 
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
					System.out.println(s1.substring(0, i)+s1.substring(i+1));
					System.out.println(s2.substring(0, j)+s2.substring(j+1));
					//s1Shift(s1,i);
					//s2Shift(s2,j);
					break;
					
				}
			
				
			}
			if(count!=0)
				break;
		}
		
	}

	/*private static void s1Shift(String s1, int i) {
		char[] c1=s1.toCharArray();
		for(int x=i;x<s1.length()-1;x++)
		{
			c1[x]=c1[x+1];
		}
		c1[s1.length()-1]=' ';
		System.out.println(String.valueOf(c1));
	}

	private static void s2Shift(String s2, int j) {
		char[] c2=s2.toCharArray();
		for(int x=j;x<s2.length()-1;x++)
		{
			c2[x]=c2[x+1];
			}
		c2[s2.length()-1]=' ';
		System.out.println(String.valueOf(c2));
		
	}
*/
}
