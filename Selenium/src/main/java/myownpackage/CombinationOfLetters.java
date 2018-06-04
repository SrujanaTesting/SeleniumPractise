package myownpackage;

import java.util.Scanner;

public class CombinationOfLetters {

	public static void main(String[] args) {
		
		System.out.println("Please enter word"); 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
int count=0;
		for (int i = 0; i < input.length(); i++) {             // pos. of 1st letter
		    for (int j = 0; j < input.length(); j++) {         // pos. of 2nd letter
		        for (int k = 0; k < input.length(); k++) {     // pos. of 3rd letter
		            if (i == j || i == k || j == k) continue;  // any letter taken twice? -> skip
		            System.out.println(input.charAt(i)+""+input.charAt(j)+""+input.charAt(k));
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}

}
