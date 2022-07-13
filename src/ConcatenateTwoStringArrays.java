import java.util.Scanner;
public class ConcatenateTwoStringArrays
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int r1, c1;
        System.out.println("Enter number of rows and then columns for string matrices");
        r1 = ob.nextInt();
        c1 = ob.nextInt();
        String a[][] = new String[r1][c1];
        String b[][] = new String[r1][c1];
        String c[][] = new String[r1][c1];
        System.out.println("Enter elements of first array");
        for(int i=0;i<r1;i++)
        {  
            for(int j=0;j<c1;j++) a[i][j]=ob.next();
        }
        System.out.println("Enter elements of second array");
        for(int i=0;i<r1;i++)
        {  
            for(int j=0;j<c1;j++) b[i][j]=ob.next();
        }
        System.out.println("I am printing resultant matrice c[]");
        for(int i=0;i<r1;i++)
        {  
            for(int j=0;j<c1;j++)
             {
                 c[i][j]=a[i][j].concat(b[i][j]);
                 System.out.print(c[i][j]+" |"); 
             }
            System.out.println();
        }  
    }
}