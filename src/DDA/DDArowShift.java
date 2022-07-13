package DDA;

import java.util.Scanner;
public class DDArowShift 
{
    public static void main(String args []) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m = Sc.nextInt();
        int n = Sc.nextInt(); 
        int arr[][]=new int[m][n];
        System.out.println("Enter elements");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
              arr[i][j] = Sc.nextInt();

            }
        }
        Sc.close();
        for(int i = 0; i<m-1; i++)
        {
            for(int j = 0; j<n-1; j++)
            {
                int tmp = arr[m][n];
                arr[m][n] = arr[i=1][j];
                arr[i+1][j]=tmp;
            }
        }
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(arr[i][j]+" ");
            
            System.out.println();
        }

    }
        
}
