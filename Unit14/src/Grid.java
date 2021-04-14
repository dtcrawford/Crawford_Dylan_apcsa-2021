//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int x = 0; x < rows; x++)
		{
			for(int y = 0;y < cols; y++)
			{
				grid[x][y] =  vals[(int)(Math.random()*(vals.length))];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = vals[0];
		for(String s : vals)
		{
			if(countVals(s) > countVals(max)) max = s;
		}
		
		return max + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(String[] rows : grid)
		{
			for(String s : rows)
			{
				if(s.equals(val)) count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(String[] rows : grid)
		{
			for(String s : rows) output += s + " ";
			output += "\n";
		}
		return output;
	}
}