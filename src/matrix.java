import java.util.Scanner;
public class matrix
{
    static Scanner sc=new Scanner(System.in);
    int arr[] []=new int[25] [25];
    int m,n;
    matrix(int mm, int nn)
    {
        m=mm;
        n=nn;
    }
    void fillarray()
    {
        System.out.println("Enter elements of array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n; j++)
                arr[i] [j]=sc.nextInt();
        }
    }
    matrix SubMat (matrix A)
    {
        matrix B=new matrix(m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n; j++)
                B.arr[i][j]= arr[i][j] - A.arr[i][j];
        }
        return B;
    }
    void display()
    {
        for(int i=0;i<m;i++)
         {
            System.out.println();
            for(int j=0;j<n;j++) 
            {
                System.out.print(arr[i][j] +" "); 
            }
          } 
    } 
    public static void main(String args []) 
    { 
    System.out.println("Size of array"); 
    int x=sc.nextInt(); 
    int y=sc.nextInt(); 
    matrix A=new matrix(x, y); 
    matrix B=new matrix(x, y); 
    matrix C=new matrix(x, y); 
    A.fillarray(); 
    B.fillarray(); 
    C=A.SubMat(B); C.display(); 
    } 
}