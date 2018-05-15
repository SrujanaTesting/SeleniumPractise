package myownpackage;

public class MissingNumber {

	public static void main(String[] args) {

		int a[]= {7,5,6,1,4,2},sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		int n=a.length+1;
		System.out.println("Missing number is "+((n*(n+1)/2)-sum));
	}

}
