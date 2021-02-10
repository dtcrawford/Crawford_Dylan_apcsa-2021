//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
   public static double go( String a, String b )
	{
		int alength = a.length();
		int blength = b.length();
		
		return (double) (blength + alength)/2;
	}
}