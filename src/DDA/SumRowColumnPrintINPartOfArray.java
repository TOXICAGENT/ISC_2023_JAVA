package DDA;

import java.util.Scanner;
public class SumRowColumnPrintINPartOfArray
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter values of matrix");
        for(int i = 0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            a[i][j] = ob.nextInt();
        }
        int sumR=0, sumC=0;
        for(int i = 0; i<3; i++)
        {
            sumC=0;
            sumR=0;
            for(int j=0; j<3; j++)
             {
                 sumR+=a[i][j];
                 sumC+=a[j][i];
             }
            a[3][i]=sumC;
            a[i][3]=sumR;
        }
        System.out.println("Printing updated matrix");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}