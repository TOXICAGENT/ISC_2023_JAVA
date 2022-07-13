import java.util.Scanner;
public class WordsOfSentence
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s=s+" ";
        String word=" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ') word = word+ch;
            else
            {
                System.out.println(word);
                word=" ";
            }
        }
    }
}