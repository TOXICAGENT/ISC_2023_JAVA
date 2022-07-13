 
import java.util.Scanner;
public class BubbleSortDescendingOrder
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i =0; i<a.length; i++) a[i]=ob.nextInt();
        int temp;
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0;j<a.length-i-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Printing the sorted array:");
        for(int i=0; i<a.length; i++) System.out.println(a[i]+" ");
    }
}