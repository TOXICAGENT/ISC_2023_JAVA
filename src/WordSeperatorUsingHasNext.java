 
import java.util.Scanner;
public class WordSeperatorUsingHasNext
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        Scanner o = new Scanner(s);
        String word = "";
        while(o.hasNext())
        {
            word = o.next();
            System.out.println(word);
        }
    }
}