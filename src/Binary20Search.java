import java.util.Scanner;
public class Binary20Search
{
    public static void main(String args[])
    {
        Binary20Search obj = new Binary20Search();
        int ans = obj.check();
        if(ans==0) System.out.println("Element not found!");
        else System.out.println("Element found! Position is "+ans);
    }
    
    public int check()
    {
        int a[] = new int[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i = 0; i<a.length; i++) a[i] = ob.nextInt();
        
        int l = 0, u = a.length-1, mid;
        System.out.println("Enter search element");
        int x = ob.nextInt();
        
        while(l<=u)
        {
            mid=(l+u)/2;
            if(a[mid]==x) return mid;
            else if(a[mid]<x) l=mid+1;
            else if(a[mid]>x) u=mid-1;
        }
        System.out.println(x+": ");
        return 0;
        }
    }
