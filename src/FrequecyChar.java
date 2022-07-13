 
import java.util.Scanner;
public class FrequecyChar
{
    public static void main(String args[])
    {
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s = ob.nextLine();
	s = s.toLowerCase();
	int freq=0;
	for(char c = 'a'; c<='z'; c++)
	{
 	    for(int i = 0; i<s.length();i++)
	      {
		char ch = s.charAt(i);
		if(ch==c) freq++; 
	      }
	    if(freq!=0) System.out.println(c+": "+freq);
	    freq=0;
	}
    }
}