import java.util.Scanner;
public class SumOfMatricesBetter
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int r1, c1;
        System.out.println("Enter nuber of rows and then columns for first matrice");
        r1 = ob.nextInt();
        c1 = ob.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r1][c1];
        int c[][] = new int[r1][c1];
        System.out.println("I am printing resultant matrice c[]");
        for(int i=0;i<r1;i++)
        {  
            for(int j=0;j<c1;j++)
             {
                 c[i][j]=a[i][j]+b[i][j];
                 System.out.print(c[i][j]+" |"); 
             }
            System.out.println();
        }  
    }
}
