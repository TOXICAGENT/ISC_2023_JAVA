 
import java.util.Scanner;
public class AnagramCheck
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s = s.toLowerCase();
        int count=0;
        int characters_counted=0;
        for(char ch = 'a'; ch<='z'; ch++)
        {
            for(int i = 0; i<s.length(); i++)
            {
                char c = s.charAt(i);
                if(ch==c)count++;
            }
            if(count!=0) characters_counted++;
        }
        if(characters_counted==26) System.out.println("It is an anagram!");
        else System.out.println("Is NOT an anagram");
    }
}