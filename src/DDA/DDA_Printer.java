package DDA;

import java.util.Scanner;
public class DDA_Printer
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][3];
        System.out.println("Enter values of matrix");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            a[i][j] = ob.nextInt();
        }
        System.out.println("I am printing the array");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            System.out.print(a[i][j]+" ");
            
            System.out.println();
        }
    }
}
