import java.util.Scanner;
public class FirstLetterToUpercase
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a string in lowercase");
        String s1 = inp.nextLine();
        StringBuffer s = new StringBuffer(s1);
        int ln = s.length();
        char ch;
        if(s.charAt(0)!=' ')
        {
            ch = s.charAt(0);
            s.setCharAt(0, Character.toUpperCase(ch));
        }
        for(int i=0; i<ln-1; i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                ch = s.charAt(i+1);
                s.setCharAt((i+1), Character.toUpperCase(ch));
            }
        }        
        System.out.println(s);
    }
}