import java.util.Scanner;
public class ProductOfMatrices
{
   public static void main(String args[])
   {
        Scanner ob = new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        System.out.println("Enter values of matrix a");
        for(int i = 0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            a[i][j] = ob.nextInt();
        }
        System.out.println("Enter values of matrix b");
        for(int i = 0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            b[i][j] = ob.nextInt();
        } 
        System.out.println("I am printing the resultant matrix: ");
        for(int i=0;i<2;i++)
        {  
            for(int j=0;j<2;j++)
             {
                 c[i][j]=0;
                 for(int k=0;k<2;k++)
                 {
                     c[i][j]+=a[i][k]*b[k][j];
                 }
                 System.out.print(c[i][j]+" "); 
             }
            System.out.println();
        }  
    }
}
