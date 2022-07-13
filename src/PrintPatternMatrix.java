import java.util.Scanner; 
public class PrintPatternMatrix
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m=ob.nextInt();
        int n=ob.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter values of matrix");
        for(int i = 0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            a[i][j] = ob.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
