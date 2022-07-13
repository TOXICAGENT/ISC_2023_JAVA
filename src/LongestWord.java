 
import java.util.Scanner;
public class LongestWord
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s = s.toLowerCase();
        Scanner sc = new Scanner(s);
        String word;
        int maxL=0; String maxS="";
        int l;
        while(sc.hasNext())
        {
            word = sc.next();
            l=word.length();
            if(l>maxL)
            {
                maxL=l;
                maxS=word;
            }
        }
        System.out.println("Longest Word: "+maxS+" and its length is: "+maxL);
    }
}