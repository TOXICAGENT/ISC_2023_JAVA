package DDA;

import java.util.Scanner;
public class DDA_SumElements
{
    public static void main(String args)
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][3];
        System.out.println("Enter values of matrix");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            a[i][j] = ob.nextInt();
        }
        int sum=0;
        System.out.println("I am printing the sum of elements of array");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            sum+=a[i][j];
        }
        System.out.println("SUM: "+sum);
    }
}
