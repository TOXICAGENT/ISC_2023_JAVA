 
import java.util.Scanner;
public class CountOccurences
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String orig = ob.next();
        System.out.println("Enter search text");
        String s = ob.next();
        int count = 0;
        while(true)
        {
            int loc = orig.indexOf(s);
            System.out.println(loc);
            if(loc==-1) break;
            count++;
            loc++;
        }
        System.out.println("Occurences = "+count);
    }
}
