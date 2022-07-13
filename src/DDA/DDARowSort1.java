package DDA;

import java.util.Scanner;

public class DDARowSort1
{
    public static void main(String args[])
     {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER THE ROWS AND COLUMS");
        int m = Sc.nextInt();
        int n = Sc.nextInt();

        if (m <= 2 || m >= 10 || n <= 2 || n >= 10) 
        {
            System.out.println("MATRIX SIZE OUT OF RANGE.");
            
        }

        int a[][] = new int[m][n];
        System.out.println("ENTER ELEMENTS");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = Sc.nextInt();
            }
        }

        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n - 1; j++) 
            {
                for (int k = 0; k < n - j - 1; k++) 
                {
                    if (a[i][k] > a[i][k + 1]) 
                    {
                        int t = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = t;
                    }
                } 
            }
        }
        
        System.out.println("SORTED ARRAY");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}