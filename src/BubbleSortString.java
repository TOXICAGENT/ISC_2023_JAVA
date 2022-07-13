 
import java.util.Scanner;
public class BubbleSortString
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n=ob.nextInt();
        String a[]=new String[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<a.length; i++)
        a[i]=ob.next();
        String tempS;
        for(int i = 0; i<a.length; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j].compareTo(a[j+1])>0)
        {
            tempS=a[j+1];
            a[j+1]=a[j];
            a[j]=tempS;
        }
            }
        }
        System.out.println("Printing sorted array");
        for(int i =0; i<a.length; i++)System.out.println(a[i]+" | "); 
    }
}