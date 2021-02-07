//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard =  new Scanner(in);
		int test, x;
		//add in input
		out.print("Enter a whole number :: ");
		test = keyboard.nextInt();
		
		System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
		System.out.println(test + " is even :: " + NumberVerify.isEven(test));
		System.out.println();
		//add in more test cases
	}
}