package DDA;

import java.util.Scanner;
public class DDA_SelectionSortSimple
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][3];
        int b[] = new int[12];
        int k = 0;
        System.out.println("Enter values of matrix");
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<3; j++)
            {
                a[i][j] = ob.nextInt();
                b[k]=a[i][j];
                k++;
            }
        }
        int temp;
        for(int i=0; i<12; i++)
        {
            for(int j=i+1;j<12;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        k=0;
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<3; j++)
            {
                a[i][j]=b[k];
                k++;
            }
        }
        System.out.println("I am printing the sorted array");
        for(int i = 0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            System.out.print(a[i][j]+" ");
            
            System.out.println();
        }
    }
}
