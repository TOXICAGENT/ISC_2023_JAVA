 
import java.util.Scanner;
public class FrequencyCalc
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = ob.nextLine();
        s=s.toLowerCase();
        int freq=0;
        for(char ch='a'; ch<='z'; ch++)
        {
            for(int i = 0; i<s.length(); i++)
            {
                if(s.charAt(i)==ch) freq++;
            }
            if(freq!=0) System.out.println("Letter: "+ch+",  Frequency: "+freq);
            freq=0;
        }
    }
}