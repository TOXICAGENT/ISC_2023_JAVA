import java.util.Scanner;
public class SP_Q11
{
    public static void main(String args []) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word in caps");
        String s = ob.next();
        char max = 'A';
        char min = 'A';
        int n= s.length();
        for (int i=0; i<n; i++) 
        {
            if (s.charAt(i) >= max)
            max = s.charAt(i);
            if (s.charAt(i) <= min)
            {
             min = s.charAt(i);
            }
         }

         System.out.println("max "+ max+ " min "+min);

        ob.close();     
    }
}