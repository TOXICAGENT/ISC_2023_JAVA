 
import java.util.Scanner;
public class PrintAndCountWords
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence to obtain its words");
        String s = ob.nextLine();
        Scanner sc = new Scanner(s);
        int count = 0;
        while(sc.hasNext())
        {
           System.out.println(sc.next());
           count++;
        }
        System.out.println(count);
    }
}