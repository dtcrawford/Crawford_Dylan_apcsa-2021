//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
	private int number;
	   
	   public Perfect()
	   {
		   number = 0;
	   }
	   
	   public Perfect(int n)
	   {
		   setNumber(n);
	   }

	   public void setNumber(int n)
	   {
		   number = n;
	   }

		public boolean isPerfect()
		{
			int sum = 0;
			int x = 1;
			
				while (x < number) {

					if (number % x == 0) {

						sum += x;

					}

					x++;

				}

				

				if (sum == number) {

					return true;

				} else {

					return false;

				}
		}

		public String toString()
		{
			if (isPerfect())
			{
				return number + " is perfect.\n";
			} else {
				return number + " is not perfect.\n";
			}
		}	
	
}