//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational()
	{
		setNumerator(1);
		setDenominator(1);
	}

	public Rational(int num, int den)
	{
		setNumerator(num);
		setDenominator(den);
	}
	//write a setRational method
	public void setRational(int num, int den)
	{
		setNumerator(num);
		setDenominator(den);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int i)
	{
		numerator = i;
	}
	
	public void setDenominator(int i)
	{
		denominator = i;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
		denominator = denominator * other.getDenominator();

		reduce();
	}

	private void reduce()
	{
		int gcdTemp = gcd(numerator, denominator);
		numerator = (int) numerator/gcdTemp;
		denominator = (int) denominator/gcdTemp;

	}

	private int gcd(int numOne, int numTwo)
	{
		int GCD = 0;
		int max = 0;
		
		//finding largest number
		if (numOne >= numTwo)
		{
			max = numOne;
		}
		else {
			max = numTwo;
		}
		
		//GCD
		for (int i = max; i>0; i--)
		{
			if(numOne%i == 0 && numTwo%i == 0 && i > GCD)
			{
				GCD = i;
			}
		}
		
		return GCD;
	}

	public Object clone() 
	{
		Rational rat = new Rational(getNumerator(), getDenominator());
		return rat;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator()
	{ 
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		if(obj instanceof Rational)
		{
			((Rational) obj).reduce();
			if(((Rational) obj).getNumerator() == numerator 
					&& ((Rational) obj).getDenominator() == denominator)
			{
				return true;
			}
		}
	
		return false;
	}

	public int compareTo(Rational other)
	{
			other.reduce();
			reduce();
			if(numerator == other.getNumerator()&& denominator == other.getDenominator())
			{
				return 0;

			}
			else if((double)numerator/denominator > (double)other.getNumerator()/other.getDenominator())
			{ 
				return 1;
		
			}
		return -1;
	}

	
	//write  toString() method
	public String toString()
	{
		return numerator + "/" + denominator;
		
	}
	
}