package myownpackage;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {
Integer n,count=0,temp;
System.out.println("enter n value");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
temp=n;
while(n>0)
{
	int reminder=n%10;
	if(reminder==0 || reminder==1) {
		count++;}
	n=n/10;
	
}

if(count==Integer.toString(temp).length())
{
	System.out.println(temp+ " is binary");
	
}
else {
	System.out.println(temp+ " is not binary");
}
	}

}
