package DDA;

import java.util.Scanner;
public class Rotate_90_Degrees
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int res[][]=new int[3][3];
        System.out.println("Enter Integers");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0,k=2;i<3;i++,k--)
        {
            for(int j=0;j<3;j++)
            {
                res[j][k]=arr[i][j];
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}