//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
		do{
			String a = ("a");	
			out.println("\nEnter a word :: " + a);
			TriangleWord.printTriangle(a);
			
			String it = ("it");	
			out.println("\nEnter a word :: " + it);
			TriangleWord.printTriangle(it);
			
			String box = ("box");	
			out.println("\nEnter a word :: " + box);
			TriangleWord.printTriangle(box);
			
			String toad = ("toad");	
			out.println("\nEnter a word :: " + toad);
			TriangleWord.printTriangle(toad);
			
			String fishy = ("fishy");	
			out.println("\nEnter a word :: " + fishy);
			TriangleWord.printTriangle(fishy);
			
			String dog = ("dog");	
			out.println("\nEnter a word :: " + dog);
			TriangleWord.printTriangle(dog);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));
	}
}