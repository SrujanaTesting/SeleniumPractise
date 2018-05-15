package myownpackage;

import java.util.Scanner;

public class ReverseAndAdd {

	public static void main(String[] args) {

		int num;
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		reversenum(num);
		
		
	}

	private static void reversenum(int n) {
		int reminder,sum=0,temp;
		temp=n;
		while(n>0)
		{
			reminder=n%10;
			sum=sum*10+reminder;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println(temp+" is a final palindrome");
		}
		else
		{
			System.out.println(temp+sum);
			reversenum(sum+temp);
		}
		
	}

}
