import java.util.Scanner;
public class SumNonBoundaryElementsOfMatrix
{
    public static void main(String[] args)
    {
        int row=0,col=0,i=0,j=0,sum=0;
        int a[][];

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROW OF MATRIX");
        row=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN OF MATRIX");
        col=sc.nextInt();

        a=new int[row][col];
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        for(i=0;i< row;i++)
        {
            for(j=0;j< col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //printing the matrix
        for(i=0;i< row;i++)
        {
            for(j=0;j< col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //calculating sum
        System.out.println("Matrix:");
        for(i=1;i< row-1;i++)
        {
            for(j=1;j< col-1;j++)
            {
                sum=sum+a[i][j];

            }
        }
        System.out.println("SUM OF NON-BOUNDARY ELEMENTS OF MATRIX: "+sum);
        sum=0;
         for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                if (i == 0 || j == 0 || i == col-1|| j == col - 1)
                {
                   System.out.print(a[i][j] + "  " );
                    sum = sum + a[i][j];
                }
                else
                System.out.println(sum);
            }
        }

        
    }
}