package DDA;

import java.util.Scanner;
public class BoundaryElementSort
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[4][3];
        System.out.println("Enter values of matrix");
        int b[] = new int[10];
        int k=0;
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
                    b[k]=a[i][j];
                    k++;
                }
            }
        }
        int temp;
        for(int i=0; i<10; i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println("Sorted boundary elements:");
        for(int i=0;i<10;i++) System.out.println(b[i]);
    }
}