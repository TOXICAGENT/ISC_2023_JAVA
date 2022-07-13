package DDA;

import java.util.Scanner;
public class BorderElementSum
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][3];
        System.out.println("Enter values of matrix");
        int b[] = new int[10];
        int sum=0;
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            a[i][j] = ob.nextInt();
        }
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i==0 || i==5 || j==0 || j==5)
                {
                    sum+=a[i][j];
                }
            }
        }
    }
}