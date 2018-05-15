package myownpackage;

import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {

		int array[]= {1,2,0,4,3,0,5,0},temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++) {
			if(array[i]==0)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			else {
				break;
			}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
