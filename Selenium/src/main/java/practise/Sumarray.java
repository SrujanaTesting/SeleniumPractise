package practise;

public class Sumarray {

	public static void main(String[] args) {
		int[] a= {1,2,-4,5,8,-2};
		int sumPos=0,sumNeg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				continue;
			else if(a[i]>0&&a[i]<=9)
			{
				sumPos=sumPos+a[i];
			}
			else
				sumNeg=sumNeg+a[i];
				
		}
		System.out.println(sumPos+" "+sumNeg);
	}

}
