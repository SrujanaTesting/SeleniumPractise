package myownpackage;

import java.util.Scanner;

public class SumOfDigits {

	public static void sumOfDigits(int n)
	{
		int reminder,sumOfDigits=0;
		while(n>0)
		{
			reminder=n%10;
			sumOfDigits=sumOfDigits+reminder;
			n=n/10;
		}
		if(sumOfDigits<10)
		{
			System.out.println(sumOfDigits);
		}
		else
		{
			sumOfDigits(sumOfDigits);
		}
		
	}
	public static void main(String[] args) {

		Integer inputNumber;
		System.out.println("enter input number");
		Scanner scan=new Scanner(System.in);
		inputNumber=scan.nextInt();
		sumOfDigits(inputNumber);
		scan.close();
	}

}
