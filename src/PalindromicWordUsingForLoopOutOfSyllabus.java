 
import java.util.Scanner;
public class PalindromicWordUsingForLoopOutOfSyllabus
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = ob.next();
        String s1="";
        for(int i=0; i<s.length(); i++)// can also do i = s.length() and then -- (keep going like this..?)
        {
            char c = s.charAt(i);
            s1=c+s1;         
        }
        System.out.println(s+": ");
        System.out.print((s1.equals(s))?"Is palindromic":"Is not palindromic");
    }
}