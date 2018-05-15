package myownpackage;

import java.util.Scanner;

class FibonocciseriesCheck
{
	
	public static void main(String[] args)
	{
		int n;
		System.out.println("enter n value");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int a=(int)Math.sqrt(5*n*n+4);
		int b=(int)Math.sqrt(5*n*n-4);
		if(a*a==5*n*n+4 || b*b==5*n*n-4)
			System.out.println(n+"is in fibonocci");
		else
			System.out.println(n+" is not in fibonocci");
		
		/*boolean status=isFibonocciSeries(n);
		if(status)
			System.out.println(n +" is in fibonocci");
		else {
			System.out.println(n+" is not in fibonocci");*/
		
	}
	/*private static boolean isFibonocciSeries(int n) {
		
		return isPerfectSquare(5*n*n+4)||isPerfectSquare(5*n*n-4);
	}
	private static boolean isPerfectSquare(int i) {
		// TODO Auto-generated method stub
		int s=(int)Math.sqrt(i);
		return s*s==i;
		
	}*/
}