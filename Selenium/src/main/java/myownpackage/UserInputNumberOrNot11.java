package myownpackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputNumberOrNot11 {

	public static boolean numberOrNot(String s)
	{
		try {
			Integer.parseInt(s);
		}catch(Exception e)
		
		{
			return false;
		}
		return true;
	}
		public static void main(String[] srujana) {
			
					String input;
					System.out.println("enter string value");
					Scanner scan=new Scanner(System.in);
					input=scan.nextLine();
					System.out.println(numberOrNot(input));
						

				

			
		
	}

}
