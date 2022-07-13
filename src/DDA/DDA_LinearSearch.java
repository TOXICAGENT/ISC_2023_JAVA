package DDA;

import java.util.Scanner;
public class DDA_LinearSearch
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][]=new int[4][3];
        System.out.println("Enter matrix elements");
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<3; j++)
           {
               a[i][j]=ob.nextInt();          
           }
        }
        System.out.println("Enter search element");
        int x = ob.nextInt();
        int flag=0;
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<3; j++)
           {
               if(a[i][j]==x)
               {
                   System.out.println("Item found. Column: "+j+", Row: "+i);
                   flag=1;
               }             
           }
        }
        if(flag!=1)System.out.println("Item not found");
    }
}