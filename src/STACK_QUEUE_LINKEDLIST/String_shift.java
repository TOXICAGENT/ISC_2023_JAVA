package STACK_QUEUE_LINKEDLIST;

import java.util.*;

public class String_shift
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String s = Sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Enter Shift");
        int shift = Sc.nextInt();
        int count = 0;
        String s2 = "",s3 = "";
        while (st.hasMoreTokens())
        {
            if (count <= st.countTokens()-(shift-1))
           {
                s2 = s2+st.nextToken();
                s2 = s2+" ";
                count++;
            }
            else
            {
                s3 = s3 + st.nextToken();
                s3 = s3 + " ";
            }
        }
        System.out.println("Shifted Sentence \n"+s3+" "+s2);


    }
}
