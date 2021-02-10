//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		 
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		int length = word.length();
 		if (length%2 != 0) {
 		 	return false;
 		}
		return true;
	}

 	public String toString()
 	{
 		String output="";
 		if(isEven() == true)
 		{
 			 output= word  + " is Even";
 		}else {
 			 output= word  + " is Odd";
 		}
 		return output;
	}
}