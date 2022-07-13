 
import java.util.Scanner;
public class DoubleLetterCheck
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence to check for double characters (or letters)");
        String s = ob.nextLine();
        Scanner sc = new Scanner(s);
        String word="";
        int count = 0;
        while(sc.hasNext())
        {
            word = sc.next();
            for(int i = 0; i<word.length()-1; i++)
            if(word.charAt(i)==word.charAt(i+1)) count++;        
        }
        System.out.println("Number of double characters = "+count);
    }
}