 
import java.util.Scanner;
public class SelectionSortString
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<a.length; i++)
        a[i]=ob.nextInt();
        int min, temp;
        for(int i = 0; i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;i++)
            {
                if(a[j]<a[min])
                {
                    temp=a[min];
                    a[min]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Printing sorted array");
        for(int i =0; i<a.length; i++)System.out.println(a[i]+" | ");
    }
}
