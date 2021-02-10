//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		 Scanner keyboard = new Scanner(in);
		   
		   out.print("Enter the first word: ");
		   String wordOne = keyboard.nextLine();
		   
		   out.print("Enter the second word: ");
		   String wordTwo = keyboard.nextLine();

		   StringEquality test = new StringEquality (wordOne, wordTwo);
		   test.checkEquality();
		   out.println(test.toString());
		
	}
}