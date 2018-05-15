package myownpackage;

public class WithoutLoops {
	
	static void printNumbers(int i)
	{
		i++;
		System.out.println(i);
		if(i<10)
		{
			printNumbers(i);
		}
		else
			System.out.println("");
		
	}

	public static void main(String[] args) {

	printNumbers(0);
	}

}
