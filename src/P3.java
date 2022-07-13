import java.util.Scanner;
public class P3
{
        public static void main (String args[])
       {
        for(int i=1;i<=5;i++)// Int i is used in a 'for loop' to repeat a satement a certain number of times.(For rows)
        {
            for(int j=1;j<=i;j++)// Int j is used in a 'for loop' to repeat a satement a certain number of times.(For columns)
            {
               if(j%2==0)
                   System.out.print("#");
               else
                   System.out.print("*");
            }
            System.out.println();
        }
    }
}