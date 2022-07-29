package DDA;

import java.util.Scanner;
public class Rotate_180_degrees
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of a square matrix");
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println("Enter "+(m*n)+" elements");
        int arr[][]=new int[m][n];
        int res[][]=new int [m][n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                res[i][j]=arr[(m-1)-i][(m-1)-j];
            }
        }
        System.out.println("Original Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated Matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}