 
import java.util.Scanner;
public class PalindromeCounterPrint
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to know how many anagrams are there and print them");
        String s = sc.next();
        Scanner ob = new Scanner(s);
        String word ="";
        int n=0;
        while(sc.hasNext())
        {
            word = sc.next();
            StringBuffer word1 = new StringBuffer(word);
            StringBuffer wordRev = new StringBuffer(word1.reverse());
            if(word1.equals(wordRev)) 
            {
                n++;
                System.out.println(word1);
            }                        
            //word.setLength(0);            
        }
        System.out.println("Number of anagrams = "+n);
    }
}