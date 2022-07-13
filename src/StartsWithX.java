 
import java.util.Scanner;
public class StartsWithX
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s=s.toLowerCase();
        Scanner sc = new Scanner(s);
        System.out.println("Enter a letter in lowercase");
        char ch = ob.next().charAt(0);
        int count = 0;
        String word;
        while(sc.hasNext())
        {
            word = sc.next();
            if(word.charAt(0)==ch)
            {
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }               
}