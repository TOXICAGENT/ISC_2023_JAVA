import java.util.Scanner;
public class ProductOfMatrices_UserDefinedDimensions 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int r1, c1r2, c2;
        System.out.println("Enter nuber of rows and then columns for first matrice");
        c1r2 = ob.nextInt();
        r1 = ob.nextInt();
        System.out.println("Enter nuber of columns for second matrice (columns = no of rows of a[])");
        c2 = ob.nextInt();
        int a[][] = new int[r1][c1r2];
        int b[][] = new int[c1r2][c2];
        int c[][] = new int[r1][c2];
        System.out.println("I am printing resultant matrice c[]");
        for(int i=0;i<r1;i++)
        {  
            for(int j=0;j<c1r2;j++)
             {
                 c[i][j]=0;
                 for(int k=0;k<2;k++)
                 {
                     c[i][j]+=a[i][k]*b[k][j];
                 }
                 System.out.print(c[i][j]+" |"); 
             }
            System.out.println();
        }  
    }
}