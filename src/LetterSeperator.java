 
import java.util.Scanner;
public class LetterSeperator
{
    public static void main(String main[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to print the letters");
        String s = ob.next();
        for(int i = 0; i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}