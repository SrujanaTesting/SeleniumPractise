package testcases;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
int decimalNum,rem;
String s="";
System.out.println("eneter decimal num");
Scanner scan=new Scanner(System.in);
decimalNum=scan.nextInt();
while(decimalNum>0)
{
	rem=decimalNum%2;
	s=s+Integer.toString(rem);
	//System.out.print(rem);
	decimalNum=decimalNum/2;
}
for(int i=s.length()-1;i>=0;i--)
{
	System.out.print(s.charAt(i));
}
	}

}
