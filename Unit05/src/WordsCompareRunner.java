//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(in);
	   
	   out.print("Enter the first word: ");
	   String firstWord = keyboard.nextLine();
	   
	   out.print("Enter the second word: ");
	   String secondWord = keyboard.nextLine();

	   WordsCompare test = new WordsCompare (firstWord, secondWord);
	   test.compare();
	   out.println(test.toString());

	}
}