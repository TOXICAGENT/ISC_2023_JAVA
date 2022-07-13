 
import java.util.Scanner;
public class ToLowercaseWithReplacedVowels
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String s_ = ob.next();
        StringBuffer s = new StringBuffer(s_);
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) s.setCharAt(i, Character.toLowerCase(ch));
            ch = Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                char newCh = (char)(ch+1);
                s.setCharAt(i,newCh);
            }
        }
        System.out.println("New word = "+s);
    }
}