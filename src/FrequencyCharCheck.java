 
import java.util.Scanner;

/**
 * 
 */
public class FrequencyCharCheck
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        Scanner ob =  new  Scanner(System.in);
        System.out.println("Enter a sentence to output number of characters apart from space");
        String s = ob.nextLine();
        /* s = s.toLowerCase();*/
        int freq = 0;
        char ch = 'a';
        while (ch <= 'Z') {
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                if (c == ch) {
                    freq = freq + 1;
                }
                i = i + 1;
            }
            if (freq != 0) {
                System.out.println("Frequency of letter " + ch + " is: " + freq);
            }
            freq = 0;
        }
    }
}
