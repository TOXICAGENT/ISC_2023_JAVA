 
import java.util.Scanner;
public class PalindromeCheck
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a palindrome");
    String origS = ob.next();
    origS=origS.toLowerCase();
    StringBuffer origSB = new StringBuffer(origS);
    StringBuffer rev = new StringBuffer();
    rev=origSB.reverse();
    String s = rev.toString();
    System.out.println("The input string is a palindrome and its reverse is: "+rev);        
    }
}