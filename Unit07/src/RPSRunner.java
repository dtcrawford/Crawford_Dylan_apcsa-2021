//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		String playing = "y";
		
		//add in a do while loop after you get the basics up and running
		
		while (playing.equals("y")) 
		{
			
			String player = "";
		
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next().toUpperCase();
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			System.out.println();
			System.out.print("Want to play again? ");
			playing = keyboard.next();
		} 
	}
}



