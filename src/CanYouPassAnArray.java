 
import java.util.Scanner;
public class CanYouPassAnArray
{
    static int n;
    static int a[]= new int[n];
    static int arr[]=new int[n];
    CanYouPassAnArray(int arr[])
    {
        for(int i = 0; i<a.length; i++)
        a[i]=arr[i];
    }
    int[] getPassedArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++) arr[i]+=2;
        return arr;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = ob.nextInt();
        System.out.println("Enter array elements");
        for(int i = 0; i<arr.length; i++) arr[i]=ob.nextInt();
        CanYouPassAnArray obj = new CanYouPassAnArray(arr);
        System.out.println("Printing new a[]");
        for(int i = 0; i<a.length; i++) System.out.print(a[i]+" ");
        int l = arr.length;
        int ans[] =obj.getPassedArray(arr);
        System.out.println("New array:");
        for(int i = 0; i<a.length; i++) System.out.print(arr[i]+" ");
    }
}