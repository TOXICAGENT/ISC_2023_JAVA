import java.util.Scanner;
public class ArrSortMerg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of both of the array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int P[] = new int[m];
        int Q[] = new int[n];
        System.out.println("Enter array P's elements");
        for(int i = 0; i<P.length; i++)
        P[i]= sc.nextInt();
        System.out.println("Enter array Q's elements");
        for(int i = 0; i<Q.length; i++)
        Q[i]= sc.nextInt();
        int t = n=m;
        int R[] = new int[t];
        for(int i = 0; i<t; i++)
        {
            R[i]=P[i]; 
                       
            R[i+m] = Q[i];              
        }
        System.out.println("Printing merged array elements");
        for(int i = 0; i< R.length; i++) System.out.println(R[i]);
    }
}