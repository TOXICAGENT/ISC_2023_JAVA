import java.util.Scanner;
public class MinMaxAverage
{
    public static void main(String args[]) 
    {
        int a[] = new int[5];
        int i, min=9999, max=0, total=0; 
        Scanner ob = new Scanner(System.in);
        for(i=0;i<5;i++)        {System.out.println("Enter number "+(i)); a[i]=ob.nextInt(); total+=a[i];}
        
        for(i=0;i<5;i++)       {if(min>a[i])min = a[i];             if(max<a[i])max = a[i];}
        
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Average: "+(total/5));
    }
}