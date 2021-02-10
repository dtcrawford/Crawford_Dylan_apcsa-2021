//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String[] vowels = new String[] {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
	   int x;
	   
	   for(x=0;x<=vowels.length-1;x++) {
		   if (vowels[x].equals(a.substring(0,1))) {
			   return "yes";
		   }
		   if (vowels[x].equals(a.substring(a.length()-1))) {
			   return "yes";
		   }
	   }
	   return "no";
	}
}