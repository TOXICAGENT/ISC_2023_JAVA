package DDA;
import java.util.Scanner;
public class Diagonals_DDA_N
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.print("Enter the Size of the Matrix (M): ");
        m = in.nextInt();
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        int a[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        //printing the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int s = 0; s <= 2*(m - 1); s++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if ( i + j == s)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

