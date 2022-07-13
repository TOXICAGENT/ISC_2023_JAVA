 
import java.util.Scanner;
public class BinarySearch
{
    
    int check()
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[10];
        int i;
        System.out.println("Enter array elements:");
        for(i=0;i<10;i++) a[i]=ob.nextInt();
        int l, u;
        l=0;
        u=a.length-1;
        int mid; 
        System.out.println("Enter element to be searched");
        int x = ob.nextInt();
        while(l<=u)
        {
            mid=(l+u)/2;
            if(mid==x)return mid;
            else if(mid<x)l=mid+1;
            else if(mid>x)u=mid-1;
        }
        System.out.println(x+" :");
        return 0; 
    }
    public static void main(String args[])
    {
        BinarySearch obj = new BinarySearch();
        int ans=obj.check();
        System.out.println(ans);
        if(ans==0) System.out.println("Search unsuccessful"); // Element not found for assignment
        else System.out.println("Search succsesful! Position: "+ans); // Element found for assignment
    }
}