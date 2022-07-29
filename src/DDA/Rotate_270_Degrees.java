package DDA;

import java.util.Scanner;
public class Rotate_270_Degrees
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of square matrix");
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println("Enter "+(m*n)+" elements");
        int arr[][]=new int[m][n];
        int res[][]=new int[m][n];
        int i,j,k;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(i=0,k=(m-1);i<m;i++,k--)
        {
            for(j=0;j<n;j++)
            {
                res[i][j]=arr[j][k];
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
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}