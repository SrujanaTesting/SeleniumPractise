package testcases;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int binaryNum,rem,base=0,mulFactor=1;
		System.out.println("enter binary digits");
		Scanner scan=new Scanner(System.in);
		binaryNum=scan.nextInt();
		while(binaryNum>0)
		{
			rem=binaryNum%10;
			if(rem==0||rem==1)
				base=base+rem*mulFactor;
			else
				break;
			mulFactor=mulFactor*2;
			binaryNum=binaryNum/10;
				
			
		}
		System.out.println(base);
		
		
		
	}
	

}
