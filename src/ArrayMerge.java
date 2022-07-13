import java.util.Scanner;
public class ArrayMerge
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int P[] = new int[5];
        int i=0;
        int Q[] = new int[4];        
        System.out.println("Enter elements of array P");
        for(i=0; i<5; i++) P[i]=ob.nextInt();        
        System.out.println("Enter elements of array Q");
        for(i=0; i<4; i++) Q[i]=ob.nextInt();        
        int R[] = new int[9];
        for(i=0; i<5; i++) R[i]=P[i];
        for(i=5; i<9; i++) R[i] = Q[i-5];     
        System.out.println("Therefore the merged array R is:");
        for(i=0; i<9; i++)System.out.print(R[i]+" ");
        }
    }