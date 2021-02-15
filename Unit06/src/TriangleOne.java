//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public String toString()
	{
		String output = "";
		for (int x = word.length(); x > 0; x--) {
			 output = output + word.substring(0,x) + "\n";
		}
		return output;
	}
}