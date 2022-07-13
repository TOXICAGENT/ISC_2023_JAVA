 
import java.util.Scanner;
public class MinimumMaximumTotalAverage
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<5; i++)
        a[i]=ob.nextInt();
        int max=0;
        int min=99999999;
        int total=0;
        int avg;
        
        for(int i = 0; i<5; i++)
        {
            if(a[i]<min)min=a[i];
            total+=a[i];
            if(a[i]>max) max = a[i];
        }
        avg=total/a.length;
        
        System.out.println("Max: "+max+",  Min:"+min+"  Total:"+total+",  Average:"+avg);
    }
}
