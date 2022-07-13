 
import java.util.Scanner;
public class Merging
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int P[] = new int[5];
        int Q[] = new int[5];
        System.out.println("Enter array P's elements");
        for(int i = 0; i<P.length; i++)
        P[i]= ob.nextInt();
        System.out.println("Enter array Q's elements");
        for(int i = 0; i<Q.length; i++)
        Q[i]= ob.nextInt();
        
        int R[] = new int[10];
        for(int i = 0; i<P.length; i++)
        {
            R[i]=P[i];            // P has been added
            R[i+5] = Q[i];       //  Q has been added            
        }
        System.out.println("Printing merged array elements");
        for(int i = 0; i< R.length; i++) System.out.println(R[i]);
    }
}