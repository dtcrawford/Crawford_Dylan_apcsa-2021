//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{

		int gcf = 0;
		int max = 0;
		
	
		if (a >= b && a >= c)
		{
			max = a;
		}
		if (b >= a && b >= c)
		{
			max = b;
		}
		if (c >= a && c >= b)
		{
			max = c;
		}
	
		for (int i = max; i>0; i--)
		{
			if (a%i == 0 && b%i == 0 && c%i == 0 && i > gcf)
			{
				gcf = i;
			}
		}
		
		return gcf;
		
		
	}
	
	public String toString()
	{
		String output="";
		
		for(int x = 1; x<number; x++)
		{
			for(int y = x; y<number; y++)
			{
				for(int z = y; z<number; z++)
				{
					if ((Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2))
							&& (z%2 != 0)
							&& ((x%2 != 0 && y%2 == 0)||(x%2 == 0 && y%2 != 0))
							&& (greatestCommonFactor(x, y, z) <= 1))
					{
						output += x + " "+ y + " " + z + "\n";
					}
				}
			}
		}
		return output;
	}
}