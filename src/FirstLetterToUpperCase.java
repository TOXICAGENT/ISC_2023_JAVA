 
import java.util.Scanner;
public class FirstLetterToUpperCase
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine().toLowerCase();
        Scanner sc = new Scanner(s);
        String word;
        while(sc.hasNext())
        {
            word = sc.next();
            StringBuffer w = new StringBuffer(word);
            char ch = word.charAt(0);
            w.setCharAt(0, Character.toUpperCase(ch));
            System.out.println(w);
        }
    }
}