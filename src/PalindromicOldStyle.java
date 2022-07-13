 
import java.util.Scanner;
public class PalindromicOldStyle
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palindromic");
        String s = ob.next();
        s = s.toLowerCase();
        String rev = "";
        for(int i = 0; i<s.length(); i++)
            rev+=s.charAt(i);
        System.out.println(rev);
        if(rev.equals(s)) System.out.println(s+" is palindromic");
        else System.out.println(s+" is not palindromic");
    }
}
