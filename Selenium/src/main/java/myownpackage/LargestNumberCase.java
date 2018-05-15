package myownpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumberCase {

	public static void main(String[] args) {
		int inputNumber,inputDigit,temp,temp1,count=0,count1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter inputNumber and inputDigit");
		inputNumber=scan.nextInt();
		inputDigit=scan.nextInt();
		temp=inputNumber;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int[] reminder = new int[count];
		System.out.println(count+"   "+inputNumber);
		for(int i=inputNumber-1;i>=0;i--)
		{
			temp1=i;
			count1=0;
			for(int j=0;temp1>0;j++)
			{
				reminder[j]=temp1%10;
				temp1=temp1/10;
				if(reminder[j]==inputDigit)
				{
					count1++;
					break;
				}
			}
			if(count1>0)
				continue;
			else  {
				System.out.println(i);
				break;
			}
			
			
			
			
		}
		
		
	}

}
