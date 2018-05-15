package myownpackage;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		
		int count,sum=0,count1=0;
		for(int i=2;i<=30;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0) {
				count++;
			}
			}
			if(count==2)
			{
				sum=sum+i;
				count1++;
			}
		}
		System.out.println(sum);

	}

}
