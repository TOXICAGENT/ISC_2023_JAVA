 
import java.util.Scanner;
public class GetReverse
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = ob.next();
        s = s.toLowerCase();
        String rev="";
        for(int i = 0; i<s.length(); i++)
            rev+=s.charAt(i);
        System.out.println("Original: "+s+", Reverse: "+rev);
    }
}