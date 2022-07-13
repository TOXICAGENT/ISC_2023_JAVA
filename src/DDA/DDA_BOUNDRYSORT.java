package DDA;

import java.util.Scanner;
public class DDA_BOUNDRYSORT
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m = Sc.nextInt();
        int n = Sc.nextInt();
        int arr[][] = new int[m][n];
        int arr1[] = new int[m*n - ((m-2)*(n-2))];
        int arr2[][] = new int[m][n];
        int a = 0; int b = 0; int c = n-1; int d = 0; int temp = 0;
        System.out.println("Enter elements");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = Sc.nextInt();
                if(i==0 || i==(m-1) || j==0 || j==(n-1))
                {
                    arr1[a] = arr[i][j];
                    a++;
                }
            }
        }
        for(int i = 0; i<(m*n - ((m-2)*(n-2))); i++)
        {
            for(int j = 0; j< (m*n - ((m-2)*(n-2)))-i-1; j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
       
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
               if(i==0)
               {
                    arr2[i][j] = arr1[b];
                    b++;
               }
               else if(j==n-1 && i>0)
               {
                   arr2[i][j] = arr1[b];
                   b++;
               }
               else if(i==m-1 && j<n-1)
               {
                   arr2[i][j] = arr1[b+c];
                   c--;
               }
               else if(j==0 && i>0 && i<m-1)
               {
                   arr2[i][j] = arr1[(m*n - ((m-2)*(n-2))) - 1 - d];
                   d++;
               }
               else
               {
                   arr2[i][j] = arr[i][j];
               }
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("SORTED MATRIX");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
            Sc.close();
        }
    }
}